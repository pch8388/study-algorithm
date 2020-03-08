package me.boj.graph.ps_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DfsBfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (ArrayList<Integer> list : graph) {
            Collections.sort(list);
        }

        booleans = new boolean[n + 1];
        dfs(s);
        builder.append("\n");
        booleans = new boolean[n + 1];
        bfs(s);
        System.out.println(builder);
    }


    static boolean[] booleans;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static StringBuilder builder = new StringBuilder();

    static void dfs(int x) {
        if (booleans[x]) return;

        booleans[x] = true;
        builder.append(x).append(" ");
        int size = graph.get(x).size();
        for (int i = 0; i < size; i++) {
            int k = graph.get(x).get(i);
            if (!booleans[k]) {
                dfs(k);
            }
        }
    }

    static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        booleans[x] = true;
        while (!queue.isEmpty()) {
            int y = queue.remove();
            builder.append(y).append(" ");
            int size = graph.get(y).size();
            for (int i = 0; i < size; i++) {
                int k = graph.get(y).get(i);
                if (!booleans[k]) {
                    booleans[k] = true;
                    queue.add(k);
                }
            }
        }
    }
}
