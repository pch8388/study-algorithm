package me.boj.datastructure.ps_10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stick {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if ('(' == input.charAt(i)) {
                stack.push(i);
            }
            if (')' == input.charAt(i)) {
                int x = i - stack.pop();
                if (x == 1) {
                    cnt += stack.size();
                } else {
                    cnt += 1;
                }
            }
        }
        reader.close();
        System.out.println(cnt);
    }
}
