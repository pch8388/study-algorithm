package me.boj.bruteforce.ps_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Leave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        solve(n, 0, 0);
        System.out.println(ans);
    }

    static int[] t = new int[15];
    static int[] p = new int[15];
    static int ans = 0;

    static void solve(int n, int day, int sum) {
        if (day > n) {
            return;
        }
        if (day == n) {
            if (ans < sum) ans = sum;
            return;
        }

        solve(n, day + t[day], sum + p[day]);
        solve(n, day + 1, sum);
    }
}
