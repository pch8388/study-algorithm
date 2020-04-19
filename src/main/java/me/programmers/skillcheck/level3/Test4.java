package me.programmers.skillcheck.level3;

import java.util.PriorityQueue;

public class Test4 {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1 < o2) {
                return 1;
            }
            if (o1 > o2) {
                return -1;
            }
            return 0;
        });

        for (int work : works) {
            queue.add(work);
        }

        for (int i = 0; i < n; i++) {
            Integer poll = queue.poll();
            queue.add(poll > 0 ? poll - 1 : 0);
        }

        long answer = 0;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            answer += poll * poll;
        }
        return answer;
    }
}
