package me.boj.bruteforce.ps_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        solve(0, 1, n, m);

    }

    static int[] arr = new int[10];
    static void solve(int index, int start, int n, int m) {
        if (index == m) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                builder.append(arr[i]).append(" ");
            }
            System.out.println(builder);
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[index] = i;
            solve(index + 1, i + 1, n, m);
        }
    }
}
