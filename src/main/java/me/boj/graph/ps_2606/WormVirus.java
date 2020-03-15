package me.boj.graph.ps_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class WormVirus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        check = new boolean[n + 1];
        dfs(graph, 1);
        System.out.println(cnt - 1);
    }

    static boolean[] check;
    static int cnt = 0;

    static void dfs(ArrayList<ArrayList<Integer>> graph, int x) {

        if(check[x]) return;
        check[x] = true;
        cnt++;

        for (int k : graph.get(x)) {
            if (!check[k]) {
                dfs(graph, k);
            }
        }

    }
}
