package me.study.a_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringTokenizer token = new StringTokenizer(s, " ");
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        int[] arr = new int[n];
        int x = 0;
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        while (st.hasMoreTokens()) {
            arr[x++] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int i1 = arr[i] + arr[j] + arr[k];
                    if (i1 <= m && i1 > max) {
                        max = i1;
                    }
                }
            }
        }
        System.out.println(max);
        reader.close();
    }
}
