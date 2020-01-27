package me.boj.dp.ps_1699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(solve(n));
    }

    static int solve(int n) {
        //d[n] = min(d[n - i^2]) + 1
        int[] d = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            d[i] = i;
            for (int j = 1; j * j <= i; j++) {
                d[i] = min(d[i - j * j] + 1, d[i]);
            }
        }

        return d[n];
    }
}
