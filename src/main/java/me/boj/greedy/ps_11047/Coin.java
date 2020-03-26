package me.boj.greedy.ps_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        Stack<Integer> stack = new Stack<>();
        while (n-- > 0) {
            stack.push(Integer.valueOf(br.readLine()));
        }

        int count = 0;
        while (!stack.isEmpty()) {
            int x = stack.pop();
            if (k / x > 0) {
                count += k / x;
                k = k % x;
            }

            if (k == 0) {
                System.out.println(count);
                return;
            }
        }

        System.out.println(count);
    }
}
