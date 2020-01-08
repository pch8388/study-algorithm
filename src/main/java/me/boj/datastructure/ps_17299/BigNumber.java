package me.boj.datastructure.ps_17299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(reader.readLine());
        int[] f = new int[1000001];
        int[] arr = new int[n];
        int[] result = new int[n];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            f[arr[i]] += 1;
        }

        stack.push(0);
        for (int i = 1; i < n; i++) {
            if (stack.empty()) {
                stack.push(i);
            }
            while (!stack.empty() && f[arr[stack.peek()]] < f[arr[i]]) {
                result[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            result[stack.peek()] = -1;
            stack.pop();
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(result[i]).append(" ");
        }
        System.out.println(builder);
        reader.close();
    }
}
