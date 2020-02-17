package me.boj.bruteforce.ps_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder builder = new StringBuilder();
        solve(0, n, m, builder);
        System.out.println(builder);
    }

    static int[] arr = new int[10];

    static void solve(int index, int n, int m, StringBuilder builder) {
        if (index == m) {

            for (int i = 0; i < m; i++) {
                builder.append(arr[i]).append(" ");
            }
            builder.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[index] = i;
            solve(index + 1, n, m, builder);
        }
    }
}
