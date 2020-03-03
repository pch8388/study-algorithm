package me.boj.dp.ps_1495;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Guitarist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] v = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, s, m, v));
    }

    static int solve(int n, int s, int m, int[] v) {
        boolean[][] dp = new boolean[n + 1][m + 1];

        dp[0][s] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (dp[i - 1][j]) {
                    if (j - v[i - 1] >= 0) {
                        dp[i][j - v[i - 1]] = true;
                    }
                    if (j + v[i - 1] <= m) {
                        dp[i][j + v[i - 1]] = true;
                    }
                }
            }
        }

        int max = -1;
        for (int j = 0; j <= m; j++) {
            if (dp[n][j]) max = j;
        }
        return max;
    }
}
