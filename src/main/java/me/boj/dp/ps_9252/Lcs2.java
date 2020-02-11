package me.boj.dp.ps_9252;

import java.io.*;

public class Lcs2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

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

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(String.valueOf(d[n1][n2]));
        bw.newLine();

        StringBuilder builder = new StringBuilder();

        int i = n1;
        int j = n2;
        while (i >= 1 && j >= 1) {
            if (d[i][j] == d[i - 1][j]) {
                i--;
            } else if (d[i][j] == d[i][j - 1]) {
                j--;
            } else {
                builder.append(s1.charAt(i - 1));
                i--;
                j--;
            }
        }

        builder.reverse();

        bw.append(builder.toString());
        bw.close();
    }
}
