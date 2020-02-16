package me.boj.dp.ps_1003;

import java.io.*;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] d = new int[41][2];
        d[0][0] = 1;
        d[1][1] = 1;
        d[2][0] = 1;
        d[2][1] = 1;

        for (int i = 3; i <= 40; i++) {
            d[i][0] = d[i - 1][0] + d[i - 2][0];
            d[i][1] = d[i - 1][1] + d[i - 2][1];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (n-- > 0) {
            int i = Integer.parseInt(br.readLine());
            bw.append(String.valueOf(d[i][0])).append(" ").append(String.valueOf(d[i][1]));
            bw.newLine();
        }
        bw.close();
    }


}
