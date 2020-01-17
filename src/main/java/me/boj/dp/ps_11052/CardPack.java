package me.boj.dp.ps_11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardPack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];
        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int k = 1; k <= n; k++) {
            arr[k] = Integer.parseInt(st.nextToken());
        }

        //D[n] = max(D[n-i]+P[i]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int x = d[i - j] + arr[j];
                if (d[i] < x) {
                    d[i] = x;
                }
            }
        }

        System.out.println(d[n]);
    }
}
