package me.boj.dp.ps_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

    public static void main(String[] args) throws IOException {
        // d[n] = 정수 N 을 3으로 나누거나, 2로 나누거나, 1을 빼서 1을 만드는 최소 횟수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] d = new int[n + 1];

        System.out.println(cal(n, d));
    }

    static int cal(int n, int[] d) {
        if (n == 1) return 0;

        if (d[n] > 0) return d[n];

        d[n] = cal(n - 1, d) + 1;
        if (n % 2 == 0) {
            int temp = cal(n / 2, d) + 1;
            if (d[n] > temp) d[n] = temp;
        }

        if (n % 3 == 0) {
            int temp = cal(n / 3, d) + 1;
            if (d[n] > temp) d[n] = temp;
        }

        return d[n];
    }
}
