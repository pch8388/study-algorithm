package me.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsOfAPhoneNumber {
    static List<String> answer;
    static Map<Integer, List<Character>> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        int len = digits.length();

        answer = new ArrayList<>();
        if (len == 0) return answer;

        map.put(2, Arrays.asList('a', 'b', 'c'));
        map.put(3, Arrays.asList('d', 'e', 'f'));
        map.put(4, Arrays.asList('g', 'h', 'i'));
        map.put(5, Arrays.asList('j', 'k', 'l'));
        map.put(6, Arrays.asList('m', 'n', 'o'));
        map.put(7, Arrays.asList('p', 'q', 'r', 's'));
        map.put(8, Arrays.asList('t', 'u', 'v'));
        map.put(9, Arrays.asList('w', 'x', 'y', 'z'));

        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = (int) digits.charAt(i) - '0';
        }
        if (len == 1) {
            return map.get(numbers[0]).stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        }

        solve(0, len, "", numbers);
        return answer;
    }

    void solve(int index, int n, String data, int[] numbers) {
        if (index == n) {
            answer.add(data);
            return;
        }

        int currentValue = numbers[index];
        int loopLength = currentValue == 7 || currentValue == 9 ? 4 : 3;
        for (int i = 0; i < loopLength; i++) {
            data += map.get(currentValue).get(i);
            solve(index + 1, n, data, numbers);
            data = data.substring(0, data.length() - 1);
        }
    }
}
