package me.boj.bruteforce.ps_9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solve(n));
    }

    static int cnt;
    static int solve(int n) {
        cnt = 0;
        for (int i = 0; i < n; i++) {
            int[] col = new int[n];
            Arrays.fill(col, -1);
            col[0] = i;
            dfs(0, col, n);
        }
        return cnt;
    }

    static void dfs(int row, int[] col, int n) {
        if (row == n - 1) {
            cnt++;
        } else {
            for (int i = 0; i < n; i++) {
                col[row + 1] = i;
                if (isAvaliable(row + 1, col, i)) {
                    dfs(row + 1, col, n);
                }
            }
        }

    }

    private static boolean isAvaliable(int row, int[] col, int y) {
        for (int i = 0; i < row; i++) {
            if (col[i] == y) {
                return false;
            }

            if (Math.abs(row - i) == Math.abs(y - col[i])) {
                return false;
            }
        }
        return true;
    }
}
