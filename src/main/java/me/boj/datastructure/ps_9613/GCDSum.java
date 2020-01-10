package me.boj.datastructure.ps_9613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long result = 0;
            for (int i = 0; i < m - 1; i++) {
                for (int j = i + 1; j < m; j++) {
                    result += gcd(arr[i], arr[j]);
                }
            }
            builder.append(result).append("\n");
        }
        System.out.println(builder);
        reader.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r  = a % b;
            a = b;
            b = r;
        }
        return a;
    }


}
