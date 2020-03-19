package me.boj.graph.ps_1261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Algospot {

    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = br.readLine().split(" ");
        int n = Integer.parseInt(sArr[1]);
        int m = Integer.parseInt(sArr[0]);

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        boolean[][] check = new boolean[n][m];
        int[][] dist = new int[n][m];
        dist[0][0] = 0;
        check[0][0] = true;

        ArrayDeque<Pair> deque = new ArrayDeque<>();
        deque.add(new Pair(0, 0));

        while (!deque.isEmpty()) {
            Pair p = deque.poll();
            int x = p.x;
            int y = p.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (check[nx][ny]) continue;
                    if (arr[nx][ny] == 0) {
                        deque.addFirst(new Pair(nx, ny));
                        dist[nx][ny] = dist[x][y];
                        check[nx][ny] = true;
                    }
                    if (arr[nx][ny] == 1) {
                        deque.addLast(new Pair(nx, ny));
                        dist[nx][ny] = dist[x][y] + 1;
                        check[nx][ny] = true;
                    }
                }
            }
        }

        System.out.println(dist[n - 1][m - 1]);
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}