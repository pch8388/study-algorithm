package me.programmers.dp.ps_43104;

class Solution {
	public long solution(int N) {
		long[] dp = new long[N + 1];
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[N] + dp[N] + dp[N - 1] + dp[N - 1];
	}
}
