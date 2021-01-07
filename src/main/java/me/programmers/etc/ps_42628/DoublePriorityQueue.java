package me.programmers.etc.ps_42628;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (String op : operations) {
            if (op.startsWith("I")) {
                final Integer integer = Integer.valueOf(op.split(" ")[1]);
                queue.add(integer);
                reverseQueue.add(integer);
            } else {
                if ("D -1".equals(op)) {
                    final Integer poll = queue.poll();
                    reverseQueue.remove(poll);
                } else {
                    final Integer poll = reverseQueue.poll();
                    queue.remove(poll);
                }
            }
        }

        if (reverseQueue.isEmpty()) {
            return new int[] {0, 0};
        }
        return new int[]{reverseQueue.poll(), queue.poll()};
    }
}
