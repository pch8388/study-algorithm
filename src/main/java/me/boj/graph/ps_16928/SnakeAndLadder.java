package me.boj.graph.ps_16928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SnakeAndLadder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] map = new int[101];

        boolean[] visited = new boolean[101];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            map[from] = to;
        }

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            map[from] = to;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        int[] dist = new int[101];
        while (!queue.isEmpty()) {
            int x = queue.remove();
            for (int i = 1; i <= 6; i++) {
                int nx = x + i;

                if (nx > 100 || visited[nx]) continue;

                if (map[nx] > 0) {
                    nx = map[nx];
                }

                if (dist[nx] == 0) {
                    visited[nx] = true;
                    dist[nx] = dist[x] + 1;
                    queue.add(nx);
                }
            }
        }

        System.out.println(dist[100]);
    }
}
