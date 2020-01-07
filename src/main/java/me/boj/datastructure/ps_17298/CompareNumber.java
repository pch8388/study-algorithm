package me.boj.datastructure.ps_17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CompareNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] input = new int[n];
        int[] result = new int[n];

        int index = 0;
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        while (st.hasMoreTokens()) {
            int max = Integer.parseInt(st.nextToken());
            input[index] = max;
            if (!stack.empty()) {
                while (!stack.empty() && max > input[stack.peek()]) {
                    result[stack.pop()] = max;
                }
            }
            stack.push(index);
            index++;
        }

        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(result[i]).append(" ");
        }
        System.out.println(builder);
    }
}
