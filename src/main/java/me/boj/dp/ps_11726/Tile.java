package me.boj.dp.ps_11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mod = 10007;

        int[] d = new int[1001];
        d[0] = 1;
        d[1] = 1;

        //d[n] = d[n-1] + d[n-2]
        for (int i = 2; i <= 1000; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % mod;
        }

        System.out.println(d[n]);
    }
}
