package me.boj.graph.ps_9466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Project {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            boolean[] check = new boolean[n + 1];
            boolean[] b = new boolean[n + 1];

            cnt = 0;
            for (int i = 1; i <= n; i++) {
                if (check[i]) continue;
                dfs(i, arr, check, b);
            }
            sb.append(n - cnt);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static int cnt;
    static void dfs(int x, int[] arr, boolean[] check, boolean[] b) {
        check[x] = true;

        int nx = arr[x];
        if (!check[nx]) {
            dfs(nx, arr, check, b);
        } else if (!b[nx]) {
            for (int i = nx; i != x; i = arr[i]) {
                cnt++;
            }
            cnt++;
        }

        b[x] = true;
    }
}
