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

        if (min < 2) {
            min = 2;
        }
        for (int i = min; i < max; i++) {
            if (!checks[i]) {
                builder.append(i).append("\n");
            }
            for (int j = i + i; j <= max; j += i) {
                checks[j] = true;
            }
        }

        System.out.println(builder);
        reader.close();
    }

}
