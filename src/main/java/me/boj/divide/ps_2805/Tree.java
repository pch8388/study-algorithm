package me.boj.divide.ps_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] height = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = 1_000_000_000;

        while (s + 1 < e) {
            int mid = (s + e) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (height[i] > mid) sum += height[i] - mid;
            }

            if (sum >= M) {
                s = mid;
            } else {
                e = mid;
            }
        }

        System.out.println(s);
    }
}
