package me.boj.dp.ps_1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[][] arr) {
        //d[i][0] = min(d[i-1][1], d[i-1][2]) + arr[i][0]

        int[][] d = new int[n][3];
        d[0][0] = arr[0][0];
        d[0][1] = arr[0][1];
        d[0][2] = arr[0][2];


        for (int i = 1; i < n; i++) {
            d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + arr[i][0];
            d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + arr[i][1];
            d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + arr[i][2];
        }

        return Math.min(Math.min(d[n - 1][0], d[n - 1][1]), d[n - 1][2]);
    }
}
