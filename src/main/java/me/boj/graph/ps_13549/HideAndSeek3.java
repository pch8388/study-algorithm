package me.boj.graph.ps_13549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class HideAndSeek3 {

    static final int MAX = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int start = Integer.parseInt(s[0]);
        int target = Integer.parseInt(s[1]);

        boolean[] check = new boolean[MAX];
        int[] dist = new int[MAX];
        

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(start);
        check[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int x = q.poll();

            if (x * 2 < MAX && !check[x * 2]) {
                check[x * 2] = true;
                dist[x * 2] = dist[x];
                q.addFirst(x * 2);
            }

            if (x - 1 >= 0 && !check[x - 1]) {
                check[x - 1] = true;
                dist[x - 1] = dist[x] + 1;
                q.addLast(x - 1);
            }

            if (x + 1 < MAX && !check[x + 1]) {
                check[x + 1] = true;
                dist[x + 1] = dist[x] + 1;
                q.addLast(x + 1);
            }
        }

        System.out.println(dist[target]);
    }
}
