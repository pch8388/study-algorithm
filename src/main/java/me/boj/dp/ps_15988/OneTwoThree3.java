package me.boj.dp.ps_15988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int limit = 1000001;
        long mod = 1_000_000_009L;
        long[] d = new long[limit];
        //4 => 7
        d[1] = 1;
        d[2] = d[1] + 1;
        d[3] = d[1] + d[2] + 1;

        for (int i = 4; i < limit; i++) {
            d[i] = (d[i - 1] + d[i - 2] + d[i - 3]) % mod;
        }

        while (n-- > 0) {
            System.out.println(d[Integer.parseInt(br.readLine())]);
        }
    }
}
