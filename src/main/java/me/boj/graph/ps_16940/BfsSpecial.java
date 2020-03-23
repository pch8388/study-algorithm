package me.boj.graph.ps_16940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BfsSpecial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            String[] s = br.readLine().split(" ");

            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);

            graph[from].add(to);
            graph[to].add(from);
        }

        int[] dist = new int[n + 1];
        boolean[] check = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        dist[1] = 1;
        check[1] = true;

        while (!q.isEmpty()) {
            int x = q.remove();

            for (int y : graph[x]) {
                if (check[y]) continue;
                q.add(y);
                dist[y] = dist[x] + 1;
                check[y] = true;
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] r = new int[n];
        int idx = 0;
        while (st.hasMoreTokens()) {
            r[idx++] = Integer.parseInt(st.nextToken());
        }

        idx = 0;
        for (int i = 0; i < n; i++) {
            if (dist[r[i]] > idx) {
                idx = dist[r[i]];
            } else if (dist[r[i]] < idx) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
