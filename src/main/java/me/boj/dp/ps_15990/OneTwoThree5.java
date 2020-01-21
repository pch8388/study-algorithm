package me.boj.dp.ps_15990;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //d[n][1] = d[n-1][2] + d[n-1][3];
        //d[n][2] = d[n-1][1] + d[n-1][3];
        //d[n][3] = d[n-1][1] + d[n-1][2];

        int limit = 100000;
        long[][] d = new long[limit + 1][4];
        long mod = 1_000_000_009;

        d[0][1] = 1;
        d[0][2] = 1;
        d[0][3] = 1;
        for (int i = 1; i <= limit; i++) {
            if (i - 1 >= 0) {
                d[i][1] = (d[i - 1][2] + d[i - 1][3]) % mod;
                if (i == 1) {
                    d[i][1] = 1;
                }
            }

            if (i - 2 >= 0) {
                d[i][2] = (d[i - 2][1] + d[i - 2][3]) % mod;
                if (i == 2) {
                    d[i][2] = 1;
                }
            }
            if (i - 3 >= 0) {
                d[i][3] = (d[i - 3][1] + d[i - 3][2]) % mod;
                if (i == 3) {
                    d[i][3] = 1;
                }
            }
        }

        //0,1 = 1;
        //0,2 = 1;
        //0,3 = 1;

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            System.out.println((d[x][1] + d[x][2] + d[x][3]) % mod);
        }
    }
}
