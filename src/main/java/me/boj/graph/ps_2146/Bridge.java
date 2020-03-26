package me.boj.graph.ps_2146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bridge {

    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static boolean[][] check;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        check = new boolean[n][n];
        int[][] dist;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!check[i][j] && arr[i][j] == 1) {
                    dfs(i, j, c++);
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int k = 1; k < c; k++) {
            check = new boolean[n][n];
            dist = new int[n][n];

            Queue<Pair> q = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == k && !check[i][j]) {
                        q.add(new Pair(i, j));
                        check[i][j] = true;
                    }
                }
            }

            while (!q.isEmpty()) {
                Pair p = q.remove();

                int x = p.x;
                int y = p.y;

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (isRange(nx, ny)) {
                        if (check[nx][ny]) continue;

                        if (arr[nx][ny] != 0) {
                            min = Math.min(min, dist[x][y]);
                            continue;
                        }

                        q.add(new Pair(nx, ny));
                        check[nx][ny] = true;
                        dist[nx][ny] = dist[x][y] + 1;
                    }
                }
            }
        }


        System.out.println(min);
    }

    static void dfs(int x, int y, int c) {
        if (check[x][y]) return;

        check[x][y] = true;
        arr[x][y] = c;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny)) {
                if (check[nx][ny] || arr[nx][ny] == 0) continue;

                dfs(nx, ny, c);
            }
        }
    }

    private static boolean isRange(int nx, int ny) {
        return nx >= 0 && nx < n && ny >= 0 && ny < n;
    }

}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}