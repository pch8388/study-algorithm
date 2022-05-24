package me.leetcode;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] map = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                map[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[j][len - 1 - i] = map[i][j];
            }
        }
    }
}
