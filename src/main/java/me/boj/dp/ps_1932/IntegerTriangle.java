package me.boj.dp.ps_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IntegerTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                arr[i][j++] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[][] arr) {
        //d[i][j] = max(d[i-1][j-1], d[i-1][j]) + arr[i][j]

        int[][] d = new int[n][n];
        d[0][0] = arr[0][0];

        if (n == 1) {
            return d[0][0];
        }

        for (int i = 1; i < n; i++) {
            d[i][0] = d[i - 1][0] + arr[i][0];
            d[i][i] = d[i - 1][i - 1] + arr[i][i];

            for (int j = 1; j < i; j++) {
                d[i][j] = Math.max(d[i - 1][j - 1], d[i - 1][j]) + arr[i][j];
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max < d[n - 1][i]) {
                max = d[n - 1][i];
            }
        }

        return max;
    }

}
