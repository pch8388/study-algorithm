package me.boj.graph.ps_13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ABCDE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(n, m, arr));
    }

    static int solve(int n, int m, int[][] arr) {
        //간선리스트
        ArrayList<Edge> edges = new ArrayList<>();
        //인접행렬
        boolean[][] booleans = new boolean[n][n];
        //인접리스트
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int from = arr[i][0];
            int to = arr[i][1];
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            booleans[from][to] = true;
            booleans[to][from] = true;
            lists.get(from).add(to);
            lists.get(to).add(from);
        }

        m *= 2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int a = edges.get(i).from;
                int b = edges.get(i).to;
                int c = edges.get(j).from;
                int d = edges.get(j).to;

                if (a == b || a == c || a == d || b == c || b == d || c == d) {
                    continue;
                }

                if (!booleans[b][c]) {
                    continue;
                }
                for (int e : lists.get(d)) {
                    if (a == e || b == e || c == e || d == e) continue;
                    return 1;
                }
            }
        }
        return 0;
    }
}

class Edge {
    int from;
    int to;

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}