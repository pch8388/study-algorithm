package me.boj.graph.ps_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Numbering {

    static int[][] array;
    static boolean[][] booleans;
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        array = new int[n][n];
        booleans = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) s.charAt(j) - '0';
            }
        }

        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    int s = dfs(i, j);
                    if (s > 0) {
                        list.add(s);
                    }
                }
            }
        }

        Collections.sort(list);
        sb.append(list.size()).append("\n");
        list.forEach(i -> sb.append(i).append("\n"));
        System.out.println(sb);
    }

    static int dfs(int x, int y) {
        int ans = 0;
        if (booleans[x][y]) return ans;

        booleans[x][y] = true;
        ans++;
        for (int i = 0; i < 4; i++) {
            int x1 = x + dx[i];
            int y1 = y + dy[i];
            if (x1 >= 0 && y1 >= 0 && x1 < n && y1 < n) {
                if (array[x1][y1] == 1) {
                    ans += dfs(x1, y1);
                }
            }
        }

        return ans;
    }
}
