package me.programmers.skillcheck.level3;

import java.util.Comparator;
import java.util.PriorityQueue;

import static java.util.Comparator.reverseOrder;

public class Test4 {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(reverseOrder());

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
