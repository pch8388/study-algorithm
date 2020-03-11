package me.boj.graph.ps_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] booleans = new boolean[n][m];
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                array[i][j] = s.charAt(j) - '0';
            }
        }

        int[][] dist = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));
        booleans[0][0] = true;
        dist[0][0] = 1;
        while (!q.isEmpty()) {
            Pair p = q.remove();
            int x = p.x;
            int y = p.y;
            for (int i = 0; i < 4; i++) {
                int x1 = x + dx[i];
                int y1 = y + dy[i];
                if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < m) {
                    if (!booleans[x1][y1] && array[x1][y1] == 1) {
                        q.add(new Pair(x1, y1));
                        dist[x1][y1] = dist[x][y] + 1;
                        booleans[x1][y1] = true;
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
