package me.programmers.dp.ps_12900;

public class Q12900 {
    public int solution(int n) {
        int mod = 1_000_000_007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        if (n <= 1) return dp[n];

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[n];
    }
}
