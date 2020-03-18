package me.programmers.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Network {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] computers = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                computers[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, computers));
    }

    static int solution(int n, int[][] computers) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (computers[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        boolean[] check = new boolean[n];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(i, n, check, graph);
                ans++;
            }
        }

        return ans;
    }

    static void dfs(int x, int n, boolean[] check, ArrayList<ArrayList<Integer>> graph) {
        if (check[x]) return;

        check[x] = true;
        for (int y : graph.get(x)) {
            if (!check[y]) dfs(y, n, check, graph);
        }
    }
}
