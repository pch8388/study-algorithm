package me.programmers.graph;

public class ColorBook {
    static final int[] dx = new int[]{1, -1, 0, 0};
    static final int[] dy = new int[]{0, 0, 1, -1};

    public int[] solution(int m, int n, int[][] picture) {

        M = m;
        N = n;
        int area = 0;
        int max = Integer.MIN_VALUE;
        boolean[][] check = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (check[i][j] || picture[i][j] == 0) continue;
                dfs(i, j, check, picture);
                area++;
                if (count > max) max = count;
                count = 0;
            }
        }

        return new int[]{area, max};

    }

    static int M;
    static int N;
    static int count = 0;

    void dfs(int x, int y, boolean[][] check, int[][] picture) {
        if (check[x][y]) return;

        check[x][y] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !check[nx][ny] && picture[x][y] == picture[nx][ny]) {
                dfs(nx, ny, check, picture);
            }
        }
    }

    boolean isRange(int x, int y) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }
}
