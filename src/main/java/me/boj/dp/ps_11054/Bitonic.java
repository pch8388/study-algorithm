package me.boj.dp.ps_11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bitonic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[] arr) {
        int[] d = new int[n];
        int[] dr = new int[n];

        d[0] = 1;

        for (int i = 1; i < n; i++) {
            d[i] = 1;
            for (int j = 1; j <= i; j++) {
                if (arr[i] > arr[i - j] && d[i] < d[i - j] + 1) {
                    d[i] = d[i - j] + 1;
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            dr[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j] && dr[i] < dr[j] + 1) {
                    dr[i] = dr[j] + 1;
                }
            }
        }

        int ans = d[0] + dr[0] - 1;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, d[i] + dr[i] - 1);
        }

        return ans;
    }
}

