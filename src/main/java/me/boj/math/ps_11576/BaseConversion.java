package me.boj.math.ps_11576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] st = reader.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);

        int n = Integer.parseInt(reader.readLine());
        int ans = 0;
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(tokenizer.nextToken());
            ans = ans * a + x;
        }
        System.out.print(conversion(ans, b));
    }

    private static String conversion(int ans, int b) {
        StringBuilder builder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (ans != 0) {
            stack.push(ans % b);
            ans = ans / b;
        }

        while (!stack.isEmpty()) {
            builder.append(stack.pop()).append(" ");
        }

        return builder.toString();
    }
}
