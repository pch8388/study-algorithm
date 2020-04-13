package me.programmers.bruteforce;

import java.util.Arrays;

public class NQueen {
    public int solution(int n) {
        cnt = 0;
        for (int i = 0; i < n; i++) {
            int[] column = new int[n];
            Arrays.fill(column, -1);
            column[0] = i;
            dfs(0, column, n);
        }
        return cnt;
    }

    static int cnt;
    private void dfs(int row, int[] column, int n) {
        if (row == n - 1) {
            cnt++;
        } else {
            for (int i = 0; i < n; i++) {
                column[row + 1] = i;
                if (isAvilable(row + 1, column, i)) {
                    dfs(row + 1, column, n);
                }
            }
        }
    }

    private boolean isAvilable(int row, int[] column, int y) {
        for (int i = 0; i < row; i++) {
            if (column[i] == y) {
                return false;
            }
            if (Math.abs(row - i) == Math.abs(y - column[i])) {
                return false;
            }
        }

        return true;
    }
}
