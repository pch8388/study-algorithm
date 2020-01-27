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

        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        // d[n] = d[n-1] + d[n-2] + d[n-3]
        for (int i = 4; i < limit; i++) {
            d[i] = (d[i - 1] + d[i - 2] + d[i - 3]) % mod;
        }

        StringBuilder builder = new StringBuilder();
        while (n-- > 0) {
            builder.append(d[Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.println(builder);
        br.close();
    }
}
