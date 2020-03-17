package me.boj.graph.ps_13913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HideAndSeek4 {

    static final int MAX = 1_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        boolean[] check = new boolean[MAX];
        int[] dist = new int[MAX];
        int[] r = new int[MAX];

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        check[n] = true;
        dist[n] = 0;

        while (!q.isEmpty()) {
            int x = q.remove();

            if (x - 1 >= 0 && !check[x - 1]) {
                q.add(x - 1);
                dist[x - 1] = dist[x] + 1;
                check[x - 1] = true;
                r[x - 1] = x;
            }

            if (x + 1 < MAX && !check[x + 1]) {
                q.add(x + 1);
                dist[x + 1] = dist[x] + 1;
                check[x + 1] = true;
                r[x + 1] = x;
            }

            if (x * 2 < MAX && !check[x * 2]) {
                q.add(x * 2);
                dist[x * 2] = dist[x] + 1;
                check[x * 2] = true;
                r[x * 2] = x;
            }
        }

        print(n, m, r);

        StringBuilder sb = new StringBuilder();
        sb.append(dist[m]).append("\n").append(n).append(" ");

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);
    }

    static Stack<Integer> stack = new Stack<>();
    static void print(int n, int x, int[] r) {
        if (n == x) {
            return;
        }

        stack.add(x);
        print(n, r[x], r);
    }
}
