package me.boj.dp.ps_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        if (n == 2) {
            System.out.println(arr[0] + arr[1]);
            return;
        }
        dp[0] = arr[0];
        dp[1] = dp[0] + arr[1];
        dp[2] = Math.max(dp[0] + arr[2], arr[1] + arr[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
