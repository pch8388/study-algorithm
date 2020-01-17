package me.boj.dp.ps_16194;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardPack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] p = new int[n + 1];
        int[] d = new int[n + 1];

        String[] s = reader.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            d[i] = 10000;
            p[i] = Integer.parseInt(s[i - 1]);
        }

        //d[n] = min(d[i], d[n - i] + P[i])
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int x = d[i - j] + p[j];
                if (x < d[i]) {
                    d[i] = x;
                }
            }
        }

        System.out.println(d[n]);
    }
}
