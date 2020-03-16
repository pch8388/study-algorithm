package me.boj.graph.ps_16947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Subway {

    static int n;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] arr;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        dfs(0, -1);

        dist = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                dist[i] = 0;
                q.add(i);
            } else {
                dist[i] = -1;
            }
        }

        while (!q.isEmpty()) {
            int x = q.remove();
            for (int y : graph.get(x)) {
                if (dist[y] == -1) {
                    q.add(y);
                    dist[y] = dist[x] + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(dist[i]).append(" ");
        }
        System.out.println(sb);
    }

    static int dfs(int x, int p) {
        if(arr[x] == 1) return x;

        arr[x] = 1;
        for (int y : graph.get(x)) {
            if (y == p) continue;
            int r = dfs(y, x);
            if (r == -2) return -2;
            if (r >= 0) {
                arr[x] = 2;

                if (x == r) return -2;
                else return r;
            }
        }

        return -1;
    }
}
