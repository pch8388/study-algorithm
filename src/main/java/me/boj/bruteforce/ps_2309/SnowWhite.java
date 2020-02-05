package me.boj.bruteforce.ps_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SnowWhite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = 9;
        int[] d = new int[limit];
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            d[i] = Integer.parseInt(br.readLine());
            sum += d[i];
        }

        boolean isBreak = false;
        for (int i = 0; i < limit - 1; i++) {
            for (int j = i + 1; j < limit; j++) {
                if (sum - d[i] - d[j] == 100) {
                    d[i] = -1;
                    d[j] = -1;
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
        }

        Arrays.sort(d);
        for (int i = 2; i < limit; i++) {
            System.out.println(d[i]);
        }
    }
}
