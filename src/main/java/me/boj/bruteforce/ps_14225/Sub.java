package me.boj.bruteforce.ps_14225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sub {

    static int n;
    static int[] arr;
    static boolean[] r;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        r = new boolean[2_000_000];

        solve(0, 0);
        for (int i = 1; i <= 2_000_000; i++) {
            if (!r[i]) {
                System.out.println(i);
                return;
            }
        }
    }

    static void solve(int idx, int sum) {
        if (idx == n) {
            r[sum] = true;
            return;
        }

        solve(idx + 1, sum + arr[idx]);
        solve(idx + 1, sum);
    }
}
