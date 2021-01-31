package me.programmers.etc.ps_12914;

public class LongJump {
    public long solution(int n) {

        long mod = 1234567L;

        if (n == 1) return 1;

        long[] dp = new long[n + 1];
        dp[0] = 1L;
        dp[1] = 1L;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[n] % mod;
    }
}
