package me.boj.datastructure.ps_17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder builder = new StringBuilder();

        boolean tags = false;
        int l = input.length();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < l; i++) {
            char c = input.charAt(i);
            if (c == '<') {
                tags = true;
                while (!stack.empty()) {
                    builder.append(stack.pop());
                }
            }

            if (!tags) {
                if (c == ' ') {
                    while (!stack.empty()) {
                        builder.append(stack.pop());
                    }
                    builder.append(' ');
                } else if (i == l - 1) {
                    stack.push(c);
                    while (!stack.empty()) {
                        builder.append(stack.pop());
                    }
                }else {
                    stack.push(c);
                }
            } else {
                builder.append(c);
            }

            if (c == '>') {
                tags = false;
            }
        }

        System.out.println(builder);
    }
}
