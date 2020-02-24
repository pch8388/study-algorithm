package me.boj.bruteforce.ps_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreeSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(recursiveSum(0, k));
        }
    }

    static int recursiveSum(int sum, int k) {
        if (sum > k) {
            return 0;
        }
        if (sum == k) {
            return 1;
        }

        int ans = 0;
        for (int i = 1; i <= 3; i++) {
            ans += recursiveSum(sum + i, k);
        }

        return ans;
    }
}
