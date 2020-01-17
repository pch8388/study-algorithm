package me.boj.dp.ps_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[11];
        arr[0] = 1;

        // D[n] = D[n-1] + D[n-2] + D[n-3]
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    arr[i] += arr[i - j];
                }
            }
        }

        int n = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        while (n-- > 0) {
            builder.append(arr[Integer.parseInt(reader.readLine())]).append("\n");
        }

        System.out.println(builder);
    }
}
