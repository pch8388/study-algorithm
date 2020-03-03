package me.boj.dp.ps_2293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solve(n, k, coin));
    }

    static int solve(int n, int k, int[] coin) {

        int[] dp = new int[k + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (j - coin[i] >= 0) dp[j] += dp[j - coin[i]];
            }
        }

        return dp[k];
    }
}
