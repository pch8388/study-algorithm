package me.boj.datastructure.ps_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        while (n-- > 0) {
            final Integer val = Integer.valueOf(br.readLine());
            if (val == 0) {
                stack.pop();
            } else {
                stack.add(val);
            }
        }

        int ans = 0;
        for (Integer val : stack) {
            ans += val;
        }

        System.out.println(ans);
    }
}
