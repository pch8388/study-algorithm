package me.boj.graph.ps_14226;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Emoticon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dist = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dist[i][j] = -1;
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 0));
        dist[1][0] = 0;

        while (!q.isEmpty()) {
            Pair p = q.remove();
            int x = p.x;
            int y = p.y;

            // 복사
            if (dist[x][x] == -1) {
                dist[x][x] = dist[x][y] + 1;
                q.add(new Pair(x, x));
            }

            // 붙여넣기
            if (x + y <= n && dist[x + y][y] == -1) {
                dist[x + y][y] = dist[x][y] + 1;
                q.add(new Pair(x + y, y));
            }

            // 삭제
            if (x - 1 >= 0 && dist[x - 1][y] == -1) {
                dist[x - 1][y] = dist[x][y] + 1;
                q.add(new Pair(x - 1, y));
            }
        }

        int ans = -1;
        for (int i = 0; i <= n; i++) {
            if (dist[n][i] != -1) {
                if (ans > dist[n][i] || ans == -1) {
                    ans = dist[n][i];
                }
            }
        }

        System.out.println(ans);
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
