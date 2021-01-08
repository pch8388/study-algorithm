package me.programmers.etc.ps_49189;

import java.util.*;
import java.util.stream.Collectors;

public class NodeDistance {
    public int solution(int n, int[][] edge) {
        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] ints : edge) {
            int first = ints[0];
            int second = ints[1];

            graph[first].add(second);
            graph[second].add(first);
        }

        int[] dist = bfs(n, graph);
        final List<Integer> collect =
            Arrays.stream(dist).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int max = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            final Integer x = collect.get(i);
            if (i == 0) {
                max = x;
                answer++;
            } else if (max == x) {
                answer++;
            }
        }

        return answer;
    }

    private int[] bfs(int n, ArrayList<Integer>[] nodes) {
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList<>();
        visited[1] = true;
        int[] dist = new int[n + 1];
        queue.offer(1);
        while (!queue.isEmpty()) {
            final Integer poll = queue.poll();
            for (Integer node : nodes[poll]) {
                if (!visited[node]) {
                    dist[node] = dist[poll] + 1;
                    queue.offer(node);
                    visited[node] = true;
                }
            }
        }

        return dist;
    }
}
