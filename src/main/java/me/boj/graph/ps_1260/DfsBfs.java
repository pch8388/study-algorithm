package me.boj.graph.ps_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DfsBfs {
    static ArrayList<ArrayList<Integer>> graphs = new ArrayList<>();
    static boolean[] checks;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

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

        for (ArrayList<Integer> graph : graphs) {
            Collections.sort(graph);
        }

        checks = new boolean[n + 1];
        dfs(start);
        sb.append("\n");
        checks = new boolean[n + 1];
        bfs(start);

        System.out.println(sb);
    }

    static void dfs(int x) {
        if (checks[x]) return;

        checks[x] = true;
        sb.append(x).append(" ");
        for (int edge : graphs.get(x)) {
            if (!checks[edge]) {
                dfs(edge);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        checks[start] = true;
        while (!q.isEmpty()) {
            int x = q.remove();
            sb.append(x).append(" ");
            for (int edge : graphs.get(x)) {
                if (!checks[edge]) {
                    q.add(edge);
                    checks[edge] = true;
                }
            }
        }
    }
}
