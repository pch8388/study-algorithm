package me.leetcode;

public class FloodFill {
    private static final int[] directionX = {-1, 0, 1, 0};
    private static final int[] directionY = {0, -1, 0, 1};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        final int originColor = image[sr][sc];
        if (originColor == newColor) {
            return image;
        }
        fillColor(image, sr, sc, originColor, newColor);
        return image;
    }

    void fillColor(int[][] image, int x, int y, int originColor, int newColor) {
        image[x][y] = newColor;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int nx = x + directionX[i];
                int ny = y + directionY[i];

                if (isRangeValue(nx, ny, image) && image[nx][ny] == originColor) {
                    fillColor(image, nx, ny, originColor, newColor);
                }
            }
        }
    }

    private boolean isRangeValue(int nx, int ny, int[][] image) {
        return nx >= 0
            && ny >= 0
            && nx < image.length
            && ny < image[0].length;
    }
}
