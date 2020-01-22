package me.boj.dp.ps_2193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //d[i][j] =
        // j = 1 -> i - 1 은 0
        // j = 0 -> i - 1 은 0 | 1
        // 3 -> 101 100
        // 4 -> 1000 1001 1010

        long[][] d = new long[n + 1][2];
        d[1][1] = 1L;

        for (int i = 2; i <= n; i++) {
            d[i][0] = d[i - 1][0] + d[i - 1][1];
            d[i][1] = d[i - 1][0];
        }

        System.out.println(d[n][0] + d[n][1]);
    }
}
