package me.boj.dp.ps_11057;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    static long solve(int n) {
        long mod = 10_007;

        long[][] d = new long[n][10];

        for (int i = 0; i <= 9; i++) d[0][i] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    d[i][j] += (d[i - 1][k]) % mod;
                }
            }
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) result += (d[n - 1][i]) % mod;

        return result % mod;
    }
}
