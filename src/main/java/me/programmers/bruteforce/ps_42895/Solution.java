package me.programmers.bruteforce.ps_42895;

public class Solution {

    static int cnt;
    static int[] numbers;
    public int solution(int N, int number) {
        cnt = -1;
        int temp = N;
        numbers = new int[8];
        numbers[0] = N;
        for (int i = 1; i < 8; i++) {
            temp = (int) Math.pow(10, i) * N + temp;
            numbers[i] = temp;
        }

        dfs(0, 0, number);
        return cnt;
    }

    private void dfs(int count, int num, int number) {
        if (count > 8) {
            return;
        }
        if (num == number) {
            if (count < cnt || cnt == -1) {
                cnt = count;
            }
            return;
        }

        for (int i = 0; i < 8; i++) {
            int x = numbers[i];
            int k = i + 1;

            dfs(count + k, num + x, number);
            dfs(count + k, num - x, number);
            dfs(count + k, num * x, number);
            dfs(count + k, num / x, number);
        }
    }
}
