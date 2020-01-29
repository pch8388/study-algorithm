package me.boj.dp.ps_1309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(solve(n));
    }

    static int solve(int n) {
        //d[n][0] = d[n-1][1] + d[n-1][2]
        int[][] d = new int[n][3];

        int mod = 9901;

        d[0][0] = 1;
        d[0][1] = 1;
        d[0][2] = 1;

        for (int i = 1; i < n; i++) {
            d[i][0] = (d[i - 1][0] + d[i - 1][1] + d[i - 1][2]) % mod;
            d[i][1] = (d[i - 1][0] + d[i - 1][2]) % mod;
            d[i][2] = (d[i - 1][0] + d[i - 1][1]) % mod;
        }

        return (d[n - 1][0] + d[n - 1][1] + d[n - 1][2]) % mod;
    }
}
