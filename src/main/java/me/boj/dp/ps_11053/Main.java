package me.boj.dp.ps_11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];



        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, int[] arr) {

        int[] d = new int[n];

        d[0] = 1;
        for (int i = 1; i < n; i++) {
            d[i] = 1;
            for (int j = 1; j <= i; j++) {
                if (arr[i] > arr[i - j] && d[i] < d[i - j] + 1) {
                    d[i] = d[i - j] + 1;
                }
            }
        }

        Arrays.sort(d);
        return d[n - 1];
    }
}
