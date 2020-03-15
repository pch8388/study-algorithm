package me.boj.graph.ps_16929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoDots {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        chars = new char[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                chars[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!check[i][j]) {
                    if (dfs(i, j, -1, -1, chars[i][j])) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");
    }

    static boolean[][] check;
    static char[][] chars;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int n;
    static int m;

    static boolean dfs(int x, int y, int px, int py, char c) {
        if (check[x][y]) return true;

        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int x1 = x + dx[i];
            int y1 = y + dy[i];

            if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < m) {
                if (!(x1 == px && y1 == py) && chars[x1][y1] == c) {
                    if (dfs(x1, y1, x, y, c)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
