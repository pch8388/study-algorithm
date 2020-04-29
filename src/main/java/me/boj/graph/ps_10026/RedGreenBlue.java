package me.boj.graph.ps_10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RedGreenBlue {

    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};

    static int n;
    static char[][] arr;
    static boolean[][] visited;
    static boolean[][] visit;
    static int cnt;
    static int cntRG;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            final String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        visited = new boolean[n][n];
        visit = new boolean[n][n];

        cnt = 0;
        cntRG = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) continue;
                dfs(i, j, arr[i][j]);
                cnt++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j]) continue;
                dfsTwo(i, j, arr[i][j]);
                cntRG++;
            }
        }

        System.out.println(cnt + " " + cntRG);
    }

    static void dfs(int x, int y, char color) {
        if (visited[x][y]) return;

        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRanged(nx, ny) && arr[nx][ny] == color) {
                dfs(nx, ny, color);
            }
        }
    }

    static void dfsTwo(int x, int y, char color) {
        if (visit[x][y]) return;

        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRanged(nx, ny)) {
                if (color == 'B' && arr[nx][ny] == color) {
                    dfsTwo(nx, ny, color);
                }
                if (color == 'R' || color == 'G') {
                    if (arr[nx][ny] == 'R' || arr[nx][ny] == 'G') {
                        dfsTwo(nx, ny, color);
                    }
                }
            }
        }
    }

    static boolean isRanged(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}
