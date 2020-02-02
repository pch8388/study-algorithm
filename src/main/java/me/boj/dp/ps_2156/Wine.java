package me.boj.dp.ps_2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[] arr) {

        int[] d = new int[n + 1];

        if (n == 1) {
            return arr[1];
        }

        d[1] = arr[1];
        d[2] = arr[1] + arr[2];

        for (int i = 3; i <= n; i++) {
            // i - 1 이 선택된 값
            d[i] = d[i - 1];
            // i - 2 가 선택되었던 값과 현재 값이 선택되었을 때 값이 더 크면
            if (d[i] < d[i - 2] + arr[i]) {
                d[i] = d[i - 2] + arr[i];
            }

            // i 가 i -1 과 연속으로 선택
            if (d[i] < d[i - 3] + arr[i] + arr[i - 1]) {
                d[i] = d[i - 3] + arr[i] + arr[i - 1];
            }
        }

        return d[n];
    }
}
