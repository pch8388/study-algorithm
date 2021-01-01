package me.programmers.etc.ps_42626;

import java.util.PriorityQueue;

public class Hot {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville) {
            queue.add(i);
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int first = queue.poll();
            if (first >= K) {
                return answer;
            }
            if (queue.isEmpty()) {
                return -1;
            }
            int second = queue.poll() * 2;
            queue.add(first + second);
            answer++;
        }

        return answer;
    }
}
