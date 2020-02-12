package me.boj.bruteforce.ps_1748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinueNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solve(Integer.parseInt(br.readLine())));
    }

    static int solve(int n) {
        int sum = 0;
        for (int s = 1, len = 1; s <= n; s *= 10, len++) {
            int e = s * 10 - 1;
            if (e > n) {
                e = n;
            }
            sum += (e - s + 1) * len;
        }

        return sum;
    }
}
