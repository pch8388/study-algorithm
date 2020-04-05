package me.programmers.skillcheck.level3;

import java.util.ArrayList;

public class Test1 {
    public int solution(int n, int[][] computers) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (i == j || computers[i][j] == 0) continue;

                graph.get(i).add(j);
                graph.get(j).add(i);
            }
        }

        check = new boolean[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(i, graph);
                answer++;
            }
        }
        return answer;
    }

    static boolean[] check;

    static void dfs(int x, ArrayList<ArrayList<Integer>> graph) {
        if (check[x]) return;

        check[x] = true;
        for (int y : graph.get(x)) {
            if (!check[y]) {
                dfs(y, graph);
            }
        }
    }
}
