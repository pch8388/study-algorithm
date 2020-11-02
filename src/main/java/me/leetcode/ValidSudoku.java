package me.leetcode;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] h = new char[9];
            char[] v = new char[9];
            for (int j = 0; j < 9; j++) {
                h[j] = board[i][j];
                v[j] = board[j][i];
            }
            if (!isValid(h)) return false;
            if (!isValid(v)) return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int idx = 0;
                char[] h = new char[9];
                for (int k = 0; k < 3; k++) {
                    for (int x = 0; x < 3; x++) {
                        h[idx] = board[k + i * 3][x + j * 3];
                        idx++;
                    }
                }
                if (!isValid(h)) return false;
            }
        }
        return true;
    }

    boolean isValid(char[] chars) {
        boolean[] visited = new boolean[10];
        for (int i = 0; i < 9; i++) {
            if (chars[i] == '.') continue;

            int x = chars[i] - '0';
            if (visited[x]) return false;
            visited[x] = true;
        }

        return true;
    }
}
