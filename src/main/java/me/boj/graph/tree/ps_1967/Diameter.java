package me.boj.graph.tree.ps_1967;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Diameter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Node>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int parent = Integer.parseInt(s[0]);
            int child = Integer.parseInt(s[1]);
            int cost = Integer.parseInt(s[2]);

            graph[parent].add(new Node(child, cost));
            graph[child].add(new Node(parent, cost));
        }

        int[] dist = bfs(n, graph, 1);
        int start = 1;
        for (int i = 2; i <= n; i++) {
            if (dist[i] > dist[start]) {
                start = i;
            }
        }

        dist = bfs(n, graph, start);
        int ans = dist[1];
        for (int i = 2; i <= n; i++) {
            ans = Math.max(ans, dist[i]);
        }

        System.out.println(ans);
    }

    static int[] bfs(int n, ArrayList<Node>[] graph, int start) {
        boolean[] check = new boolean[n + 1];
        int[] dist = new int[n + 1];

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()) {
            int x = q.remove();

            for (Node node : graph[x]) {
                int y = node.x;
                int cost = node.cost;

                if (check[y]) continue;

                q.add(y);
                dist[y] = dist[x] + cost;
                check[y] = true;
            }
        }

        return dist;
    }
}

class Node {
    int x, cost;

    public Node(int x, int cost) {
        this.x = x;
        this.cost = cost;
    }
}