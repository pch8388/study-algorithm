package me.boj.graph.ps_7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    final static int[] dx = {0, 0, 1, -1};
    final static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] check = new boolean[m][n];
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
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
                int x1 = x + dx[i];
                int y1 = y + dy[i];
                if (x1 >= 0 && x1 < m && y1 >= 0 && y1 < n) {
                    if (!check[x1][y1] && arr[x1][y1] == 0) {
                        q.add(new Pair(x1, y1));
                        arr[x1][y1] = arr[x][y] + 1;
                        check[x1][y1] = true;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > 0 && arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] == 0) {
                    max = Integer.MAX_VALUE;
                }
            }
        }

        if (max == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(max - 1);
        }
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
