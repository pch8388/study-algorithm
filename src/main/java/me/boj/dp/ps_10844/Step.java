package me.boj.dp.ps_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long mod = 1_000_000_000L;
        long[][] d = new long[n + 1][10];

        for (int i = 1; i <= 9; i++) {
            d[1][i] = 1;
        }

        //d[i][j] = d[i - 1][j - 1] + d[i - 1][j + 1]
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                d[i][j] = 0;
                if (j - 1 >= 0) d[i][j] += d[i - 1][j - 1];
                if (j + 1 <= 9) d[i][j] += d[i - 1][j + 1];

                d[i][j] %= mod;
            }
        }

        long result = 0L;
        for (int i = 0; i <= 9; i++) {
            result += d[n][i];
        }

        System.out.println((result % mod));
    }
}
