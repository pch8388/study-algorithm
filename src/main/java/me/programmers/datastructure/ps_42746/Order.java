package me.programmers.datastructure.ps_42746;

import java.util.Arrays;

public class Order {
    public String solution(int[] numbers) {
        String[] array = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(array, (s1, s2) -> ((s2 + s1)).compareTo(s1 + s2));

        StringBuilder answer = new StringBuilder();
        for (String s : array) {
            answer.append(s);
        }

        if ("0".equals(answer.substring(0, 1)))
            return "0";

        return answer.toString();
    }
}
