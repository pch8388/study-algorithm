package me.boj.graph.ps_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cabbage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] arr = new int[w][h];
            boolean[][] check = new boolean[w][h];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;
            }

            int ans = 0;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (!check[i][j] && arr[i][j] == 1) {
                        dfs(w, h, arr, check, i, j);
                        ans++;
                    }
                }
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static void dfs(int w, int h, int[][] arr, boolean[][] check, int x, int y) {

        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
                if (!check[nx][ny] && arr[nx][ny] == 1) {
                    dfs(w, h, arr, check, nx, ny);
                }
            }
        }
    }
}
