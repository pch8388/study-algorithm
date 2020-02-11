package me.boj.dp.ps_9251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lcs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        System.out.println(solve(s1, s2));
    }

    static int solve(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] d = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    d[i][j] = d[i - 1][j - 1] + 1;
                } else {
                    d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]);
                }
            }
        }

        return d[n1][n2];
    }
}
