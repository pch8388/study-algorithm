package me.boj.bruteforce.ps_14502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Laboratory {
    static int[][] map;
    static int N;
    static int M;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        int wallCnt = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    wallCnt++;
                }
            }
        }

        dfsWall(0);

        System.out.println((N * M) - (wallCnt + 3 + ans));
    }

    static int ans = Integer.MAX_VALUE;
    static int virusCnt = 0;

    private static void dfsWall(int depth) {
        if (depth == 3) {
            virusCnt = 0;
            visited = new boolean[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 2 && !visited[i][j]) {
                        dfsVirus(i, j);
                    }
                }
            }

            ans = Math.min(ans, virusCnt);
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfsWall(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};

    private static void dfsVirus(int x, int y) {
        visited[x][y] = true;
        virusCnt++;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isRange(nx, ny) && !visited[nx][ny] && map[nx][ny] == 0) {
                    dfsVirus(nx, ny);
                }
            }
        }
    }

    private static boolean isRange(int nx, int ny) {
        return nx >= 0 && nx < N && ny >= 0 && ny < M;
    }
}
