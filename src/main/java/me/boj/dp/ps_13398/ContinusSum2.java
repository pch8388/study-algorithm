package me.boj.dp.ps_13398;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class ContinusSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[] arr) {
        int[] d = new int[n];
        int[] dr = new int[n];

        // dp[n] = d[n-1] + dr[n+1]

        // 정방향으로 연속합 구함
        for (int i = 0; i < n; i++) {
            d[i] = arr[i];
            if (i == 0) continue;
            if (d[i] < d[i - 1] + arr[i]) {
                d[i] = d[i - 1] + arr[i];
            }
        }

        // 역방향으로 연속합 구함
        for (int i = n - 1; i >= 0; i--) {
            dr[i] = arr[i];
            if (i == n - 1) continue;
            if (dr[i] < dr[i + 1] + arr[i]) {
                dr[i] = dr[i + 1] + arr[i];
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = max(ans, d[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            ans = max(ans, d[i - 1] + dr[i + 1]);
        }

        return ans;
    }
}
