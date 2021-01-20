package me.programmers.bruteforce.ps_42839;

import java.util.HashMap;

public class FindPrimeNumber {

    static int count;
    static boolean[] visited;
    static HashMap<Integer, Boolean> map;

    public int solution(String numbers) {
        int len = numbers.length();

        visited = new boolean[len];
        map = new HashMap<>();
        count = 0;
        dfs(numbers, "");
        return count;
    }

    private void dfs(String numbers, String number) {
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                String newNumber = number + numbers.charAt(i);
                int num = Integer.parseInt(newNumber);
                if (!map.containsKey(num)) {
                    map.put(num, true);
                    if (num > 1 && search(num)) count++;
                }
                visited[i] = true;
                dfs(numbers, newNumber);
                visited[i] = false;
            }
        }
    }


    private boolean search(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
