package me.boj.math.ps_6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbach {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean[] booleans = new boolean[1000001];
        int[] prime = new int[1000001];
        int count = 0;

        for (int i = 0; i <= 1000000; i++) {
            booleans[i] = false;
        }

        for (int i = 2; i < 1000000; i++) {
            if (!booleans[i]) {
                prime[count++] = i;
                for (int j = i + i; j <= 1000000; j += i) {
                    booleans[j] = true;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        while (true) {
            boolean isFound = false;
            int input = Integer.parseInt(reader.readLine());
            if (input == 0) break;

            for (int i = 0; i < input; i++) {
                if (!booleans[input - prime[i]]) {
                    isFound = true;
                    builder.append(input).append(" = ").append(prime[i]).append(" + ").append(input - prime[i]).append("\n");
                    break;
                }
            }
            if (!isFound) {
                builder.append(input).append(" = ").append("Goldbach's conjecture is wrong.\n");
            }
        }
        System.out.println(builder);
        reader.close();
    }
}
