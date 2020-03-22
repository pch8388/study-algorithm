package me.boj.graph.tree.ps_1167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Diameter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Node>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                int t = Integer.parseInt(st.nextToken());
                if (t == -1) break;

                int d = Integer.parseInt(st.nextToken());
                graph[x].add(new Node(t, d));
                graph[t].add(new Node(x, d));
            }
        }

        int[] dist = bfs(n, graph, 1);
        int s = 1;
        for (int i = 2; i <= n; i++) {
            if (dist[i] > dist[s]) {
                s = i;
            }
        }

        dist = bfs(n, graph, s);
        int ans = dist[1];
        for (int i = 2; i <= n; i++) {
            if (ans < dist[i]) {
                ans = dist[i];
            }
        }

        System.out.println(ans);
    }

    static int[] bfs(int n, ArrayList<Node>[] nodes, int start) {
        boolean[] check = new boolean[n + 1];
        int[] dist = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();
        check[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int x = q.remove();
            for (Node node : nodes[x]) {
                int y = node.x;
                int d = node.dist;
                if (!check[y]) {
                    dist[y] = dist[x] + d;
                    q.add(y);
                    check[y] = true;
                }
            }
        }

        return dist;
    }
}

class Node {
    int x, dist;

    public Node(int x, int dist) {
        this.x = x;
        this.dist = dist;
    }
}
