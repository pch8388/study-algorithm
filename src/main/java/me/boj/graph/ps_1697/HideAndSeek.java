package me.boj.graph.ps_1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideAndSeek {
    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.add(n);

        boolean[] check = new boolean[MAX];
        int[] dist = new int[MAX];

        check[n] = true;
        dist[n] = 0;

        while (!q.isEmpty()) {
            int x = q.remove();

            if (x - 1 >= 0 && !check[x - 1]) {
                q.add(x - 1);
                check[x - 1] = true;
                dist[x - 1] = dist[x] + 1;
            }

            if (x + 1 < MAX && !check[x + 1]) {
                q.add(x + 1);
                check[x + 1] = true;
                dist[x + 1] = dist[x] + 1;
            }

            if (x * 2 < MAX && !check[x * 2]) {
                q.add(x * 2);
                check[x * 2] = true;
                dist[x * 2] = dist[x] + 1;
            }
        }

        System.out.println(dist[m]);
    }

}
