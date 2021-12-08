package me.programmers.study;

import java.util.*;

public class ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        CustomQueue boards = new CustomQueue(board.length);
        CustomStack stack = new CustomStack();

        boards.add(board);

        int answer = 0;
        for (int j : moves) {
            int move = boards.poll(j - 1);
            int topVal = stack.peek();

            if (topVal != 0 && topVal == move) {
                stack.pop();
                answer += 2;
            } else if (move != 0) {
                stack.push(move);
            }
        }

        return answer;
    }

    static class CustomStack {
        private final Stack<Integer> stack;

        CustomStack() {
            stack = new Stack<>();
        }

        int peek() {
            if (stack.empty()) {
                return 0;
            }
            return stack.peek();
        }

        void pop() {
            if (!stack.empty()) {
                stack.pop();
            }
        }

        void push(int val) {
            stack.push(val);
        }
    }

    static class CustomQueue {
        private final List<Queue<Integer>> queue;

        CustomQueue(int size) {
            queue = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                queue.add(new LinkedList<>());
            }
        }

        int poll(int index) {
            if (queue.get(index).isEmpty()) {
                return 0;
            }
            return queue.get(index).poll();
        }
        void add(int[][] data) {
            int size = data.length;
            for (int[] d : data) {
                for (int j = 0; j < size; j++) {
                    if (d[j] != 0) {
                        queue.get(j).add(d[j]);
                    }
                }
            }
        }
    }
}
