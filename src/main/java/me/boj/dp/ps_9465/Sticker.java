package me.boj.dp.ps_9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        while (m-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][2];

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = 0;
            while (st.hasMoreTokens()) {
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st2.nextToken());
                i++;
            }

            System.out.println(solve(n, arr));
        }


    }

    static int solve(int n, int[][] arr) {
        int[][] d = new int[n][3];

        d[0][1] = arr[0][0];
        d[0][2] = arr[0][1];

        for (int i = 1; i < n; i++) {
            d[i][0] = max(max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
            d[i][1] = max(d[i - 1][0], d[i - 1][2]) + arr[i][0];
            d[i][2] = max(d[i - 1][0], d[i - 1][1]) + arr[i][1];
        }

        return max(max(d[n - 1][0], d[n - 1][1]), d[n - 1][2]);
    }
}
