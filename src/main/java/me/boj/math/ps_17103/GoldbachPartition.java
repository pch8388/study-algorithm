package me.boj.math.ps_17103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachPartition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        final int SIZE = 1000001;
        boolean[] booleans = new boolean[SIZE];
        int[] prime = new int[SIZE];
        int count = 0;

        for (int i = 2; i < 1000000; i++) {
            if (!booleans[i]) {
                prime[count++] = i;
                for (int j = i + i; j < 1000000; j += i) {
                    booleans[j] = true;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        while (n-- > 0) {
            int result = 0;
            int m = Integer.parseInt(reader.readLine());
            for (int i = 0; i < prime.length; i++) {
                if (m - prime[i] >= 2 && prime[i] <= m - prime[i]) {
                    if (!booleans[m - prime[i]]) {
                        result++;
                    }
                } else {
                    break;
                }
            }
            builder.append(result).append("\n");
        }

        System.out.println(builder);
    }
}
