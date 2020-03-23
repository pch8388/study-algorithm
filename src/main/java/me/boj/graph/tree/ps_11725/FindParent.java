package me.boj.graph.tree.ps_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindParent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]) - 1;
            int y = Integer.parseInt(s[1]) - 1;

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        boolean[] check = new boolean[n];
        int[] parent = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        check[0] = true;

        while (!q.isEmpty()) {
            int x = q.remove();

            for (int y : graph.get(x)) {
                if (check[y]) continue;
                q.add(y);
                check[y] = true;
                parent[y] = x;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + 1);
        }
    }
}
