package me.study.a_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        List<Character> chars = new ArrayList<>();

        int count = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(bf.readLine());
            while (count <= m) {
                stack.push(count++);
                chars.add('+');
            }
            if (stack.peek() == m) {
                stack.pop();
                chars.add('-');
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (Character c : chars) {
            System.out.println(c);
        }
    }
}
