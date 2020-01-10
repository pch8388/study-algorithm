package me.boj.datastructure.ps_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumberCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        boolean[] checks = new boolean[max + 1];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= max; i++) {
            checks[i] = false;
        }

        for (int i = 2; i <= max; i++) {
            if (!checks[i]) {
                if (i >= min) {
                    builder.append(i).append("\n");
                }
            }
            for (int j = i + i; j <= max; j += i) {
                checks[j] = true;
            }
        }

        System.out.print(builder);
        reader.close();
    }

}
