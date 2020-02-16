package me.boj.bruteforce.ps_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM2v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        solve(1, 0, n, m);

    }

    static int[] arr = new int[10];

    static void solve(int index, int selected, int n, int m) {
        if (selected == m) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                builder.append(arr[i]).append(" ");
            }
            System.out.println(builder);
            return;
        }

        if (index > n) return;
        arr[selected] = index;
        solve(index + 1, selected + 1, n, m);
        arr[selected] = 0;
        solve(index + 1, selected, n, m);
    }
}
