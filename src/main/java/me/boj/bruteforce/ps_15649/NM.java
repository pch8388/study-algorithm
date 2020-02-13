package me.boj.bruteforce.ps_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        solve(0, n, m);
    }

    static boolean[] b = new boolean[10];
    static int[] arr = new int[10];

    static void solve(int idx, int n, int m) {
        if (idx == m) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                builder.append(arr[i]).append(" ");
            }
            System.out.println(builder);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (b[i]) continue;
            b[i] = true;
            arr[idx] = i;
            solve(idx + 1, n, m);
            b[i] = false;
        }
    }
}
