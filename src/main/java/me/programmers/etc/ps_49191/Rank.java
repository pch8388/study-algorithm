package me.programmers.etc.ps_49191;

import java.util.*;

public class Rank {
    public int solution(int n, int[][] results) {
        List<Info> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new Info(i));
        }

        for (int[] result : results) {
            int win = result[0] - 1;
            int loose = result[1] - 1;

            Info winnerInfo = graph.get(win);
            Info looserInfo = graph.get(loose);

            winnerInfo.looser.add(loose);
            winnerInfo.looser.addAll(looserInfo.looser);

            looserInfo.winner.add(win);
            looserInfo.winner.addAll(winnerInfo.winner);
        }
        int answer = 0;

        PriorityQueue<Info> queue = new PriorityQueue<>(graph);

        while (!queue.isEmpty()) {
            final Info poll = queue.poll();
            for (Integer i : poll.winner) {
                graph.get(i).looser.addAll(poll.looser);
            }
            for (Integer i : poll.looser) {
                graph.get(i).winner.addAll(poll.winner);
            }
        }

        for (Info info : graph) {
            final int sum = info.winner.size() + info.looser.size();
            if (sum == n - 1) answer++;
        }
        return answer;
    }

    static class Info implements Comparable<Info> {
        int index;
        Set<Integer> winner, looser;

        public Info(int index) {
            this.index = index;
            winner = new HashSet<>();
            looser = new HashSet<>();
        }

        @Override
        public int compareTo(Info o) {
            return Integer.compare(o.winner.size() + o.looser.size(), winner.size() + looser.size());
        }
    }
}
