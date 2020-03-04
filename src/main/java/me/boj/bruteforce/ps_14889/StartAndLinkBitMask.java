package me.boj.bruteforce.ps_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StartAndLinkBitMask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] s = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = Integer.MAX_VALUE;


        for (int i = 1; i < (1 << n); i++) {
            ArrayList<Integer> first = new ArrayList<>();
            ArrayList<Integer> second = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                if ((i & (1 << k)) != 0) {
                    first.add(k);
                } else {
                    second.add(k);
                }
            }

            if (first.size() != n / 2) continue;
            int t1 = 0;
            int t2 = 0;
            for (int j = 0; j < n / 2; j++) {
                for (int x = 0; x < n / 2; x++) {
                    t1 += s[first.get(j)][first.get(x)];
                    t2 += s[second.get(j)][second.get(x)];
                }
            }
            int diff = Math.abs(t1 - t2);
            if (ans > diff) ans = diff;
        }

        System.out.println(ans);
    }
}
