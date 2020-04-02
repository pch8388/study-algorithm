package me.boj.bruteforce.ps_10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eureka {
    static int[] T;
    static {
        T = new int[50];
        for (int i = 1; i < 50; i++) {
            T[i] = i * (i + 1) / 2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            sb.append(solve(Integer.parseInt(br.readLine())));
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static int solve(int k) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int x = 1; x < 45; x++) {
                    if (T[i] + T[j] + T[x] == k) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
