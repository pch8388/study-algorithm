package me.boj.dp.ps_1010;

public class Bridge {
    public static void main(String[] args) {

    }

    static int solve(int n, int m) {
        if (n == 1) return m;
        if (n == m) return 1;

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= m; i++) dp[1][i] = i;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= m; j++) {
                for (int k = j; k >= i; k--) {
                    dp[i][j] += dp[i - 1][k - 1];
                }
            }
        }
        return dp[n][m];
    }
}
