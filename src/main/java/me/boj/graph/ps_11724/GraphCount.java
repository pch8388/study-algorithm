package me.boj.graph.ps_11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GraphCount {

    static boolean[] checks;
    static ArrayList<ArrayList<Integer>> graphs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + 1; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graphs.get(from).add(to);
            graphs.get(to).add(from);
        }

        checks = new boolean[n + 1];

        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!checks[i]) {
                dfs(i);
                ans++;
            }
        }

        System.out.println(ans);
    }

    static void dfs(int x) {
        if (checks[x]) return;

        checks[x] = true;
        for (int y : graphs.get(x)) {
            if (!checks[y]) {
                dfs(y);
            }
        }
    }

}
