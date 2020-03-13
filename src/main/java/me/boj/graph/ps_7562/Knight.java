package me.boj.graph.ps_7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Knight {
    static final int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static final int[] dy = {-2, -1, 1, 2, -2, -1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int i = Integer.parseInt(br.readLine());
            int[][] arr = new int[i][i];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(x, y));
            arr[x][y] = 1;

            while (!q.isEmpty()) {
                Pair p = q.remove();
                int x1 = p.x;
                int y1 = p.y;

                if (x1 == endX && y1 == endY) {
                    sb.append(arr[x1][y1] - 1).append("\n");
                }

                for (int k = 0; k < 8; k++) {
                    int x2 = x1 + dx[k];
                    int y2 = y1 + dy[k];

                    if (x2 >= 0 && x2 < i && y2 >= 0 && y2 < i) {
                        if (arr[x2][y2] == 0) {
                            q.add(new Pair(x2, y2));
                            arr[x2][y2] = arr[x1][y1] + 1;
                        }
                    }
                }
            }
        }

        System.out.println(sb);
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
