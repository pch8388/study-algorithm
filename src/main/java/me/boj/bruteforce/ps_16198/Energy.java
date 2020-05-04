package me.boj.bruteforce.ps_16198;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Energy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        boolean[] used = new boolean[n];

        answer = 0;
        dfs(n, 0, numbers, used, 0);
        System.out.println(answer);
    }

    static int answer;

    static void dfs(int n, int cnt, int[] numbers, boolean[] used, int sum) {
        if (n - 2 == cnt) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 1; i < n - 1; i++) {
            if (used[i]) continue;

            int prev = i - 1;
            int next = i + 1;
            while (used[prev]) {
                prev--;
            }
            while (used[next]) {
                next++;
            }
            int k = (numbers[prev]) * (numbers[next]);
            used[i] = true;
            dfs(n, cnt + 1, numbers, used, sum + k);
            used[i] = false;
        }
    }
}
