package me.boj.dp.ps_11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardPack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] d = new int[n + 1];

        //d[n] = max(d[n - j] + P[j]);
        int[] P = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int x = 1; x <= n; x++) {
            P[x] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int m = d[i - j] + P[j];
                if (d[i] < m) {
                    d[i] = m;
                }
            }
        }

        System.out.println(d[n]);
    }
}
