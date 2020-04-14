package me.boj.divide.ps_2512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] budget = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            budget[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(budget);
        int M = Integer.parseInt(br.readLine());

        int s = 0;
        int e = budget[N - 1];
        while (s < e) {
            int mid = (s + e + 1) / 2;

            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.min(budget[i], mid);
            }

            if (sum <= M) s = mid;
            else e = mid - 1;
        }
        System.out.println(s);
    }
}
