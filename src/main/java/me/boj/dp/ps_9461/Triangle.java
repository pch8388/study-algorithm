package me.boj.dp.ps_9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            System.out.println(solve(Integer.parseInt(br.readLine())));
        }
    }

    static long solve(int n) {
        if (n <= 3) {
            return 1;
        }
        if(n == 4) {
            return 2;
        }

        long[] d = new long[n + 1];
        d[1] = 1;
        d[2] = 1;
        d[3] = 1;
        d[4] = 2;

        for (int i = 5; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 5];
        }

        return d[n];
    }
}
