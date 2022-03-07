package me.programmers.etc.ps_12973;

import java.util.Stack;

public class Solution {

    public int solution(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (stack.isEmpty()) {
                stack.add(cur);
            } else if (stack.peek() == cur) {
                stack.pop();
            } else {
                stack.add(cur);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
