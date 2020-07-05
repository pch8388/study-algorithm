package me.leetcode;

import java.util.Stack;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        Stack<Character> s = new Stack<>();
        final String value = String.valueOf(x);
        for (int i = 0; i < value.length(); i++) {
            s.push(value.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString().equals(value);
    }
}
