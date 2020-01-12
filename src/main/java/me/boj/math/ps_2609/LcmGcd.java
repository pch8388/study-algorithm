package me.boj.math.ps_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LcmGcd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] st = reader.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);

        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println((a * b) / gcd);
        reader.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
