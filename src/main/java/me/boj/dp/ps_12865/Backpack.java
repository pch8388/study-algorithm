package me.boj.dp.ps_12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backpack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] w = new int[n + 1];
        int[] v = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, k, w, v));
    }

    static int solve(int n, int k, int[] w, int[] v) {
        int[][] d = new int[n + 1][k + 1];

        // d[i][j] = if(j < w[i]) d[i - 1][j]
        //         = if(j >= w[i]) max (d[i - 1][j], d[i - 1][j - w[i]] + v[i])

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j < w[i]) {
                    d[i][j] = d[i - 1][j];
                } else {
                    d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - w[i]] + v[i]);
                }
            }
        }

        return d[n][k];
    }
}
