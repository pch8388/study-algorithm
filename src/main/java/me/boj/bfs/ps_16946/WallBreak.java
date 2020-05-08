package me.boj.bfs.ps_16946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WallBreak {
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int[][] groupMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        groupMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
                if (map[i][j] != 0) {
                    visited[i][j] = true;
                }
            }
        }


        int group = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    bfs(i, j, group);
                    group++;
                }
            }
        }

        int[] groupCount = new int[group + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (groupMap[i][j] != 0) {
                    groupCount[groupMap[i][j]]++;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (groupMap[i][j] != 0) {
                    builder.append(0);
                    continue;
                }

                Set<Integer> set = new HashSet<>();
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (isRanged(nx, ny) && groupMap[nx][ny] != 0) {
                        set.add(groupMap[nx][ny]);
                    }
                }
                int cnt = 1;
                for (Integer integer : set) {
                    cnt += groupCount[integer];
                }
                builder.append(cnt % 10);
            }
            builder.append("\n");
        }
        System.out.println(builder);
    }

    private static void bfs(int x, int y, int group) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));
        visited[x][y] = true;
        groupMap[x][y] = group;
        while (!q.isEmpty()) {
            Node node = q.remove();
            int px = node.x;
            int py = node.y;
            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (isRanged(nx, ny) && !visited[nx][ny]) {
                    q.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                    groupMap[nx][ny] = group;
                }
            }
        }
    }

    private static boolean isRanged(int ni, int nj) {
        return ni >= 0 && ni < n && nj >= 0 && nj < m;
    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
