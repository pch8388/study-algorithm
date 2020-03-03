package me.boj.datastructure.ps_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class Stair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[] arr) {
        // dp[n] = max(마지막 전 계단을 밟은경우, 마지막 전 계단을 밟지않고 전전계단을 밟은 경우)

        int[] d = new int[n];
        d[0] = arr[0];
        d[1] = max(d[0] + arr[1], arr[1]);
        d[2] = max(d[0] + arr[2], arr[1] + arr[2]);

        for (int i = 3; i < n; i++) {
            d[i] = max(d[i - 3] + arr[i - 1] + arr[i], d[i - 2] + arr[i]);
        }

        return d[n - 1];
    }
}
