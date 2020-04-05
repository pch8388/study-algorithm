package me.programmers.datastructure;

import java.util.Stack;

public class Stick {
    public int solution(String arrangement) {
        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                stack.push(i);
            } else if (arrangement.charAt(i) == ')') {
                int x = i - stack.pop();
                if (x == 1) {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }
}
