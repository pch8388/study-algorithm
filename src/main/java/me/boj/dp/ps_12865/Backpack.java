package me.boj.dp.ps_12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backpack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] w = new int[n];
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, k, w, v));
    }

    static int solve(int n, int k, int[] w, int[] v) {
        int[] d = new int[n];
        for (int i = 1; i < n; i++) {
            d[i] = v[i];
            int weight = w[i];
            if (w[i] > k) {
                d[i] = -1;
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (d[i] + v[j] > d[i] && weight + w[j] <= k) {
                    d[i] += v[j];
                    weight += w[j];
                }
            }
        }

        Arrays.sort(d);
        return d[n - 1];
    }
}
