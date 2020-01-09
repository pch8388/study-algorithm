package me.boj.datastructure.ps_1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixNotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double[] arr = new double[n];
        String s = reader.readLine();

        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(reader.readLine());
        }

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                calculate(stack, stack.pop(), stack.pop(), c);
            } else {
                stack.push(arr[c - 'A']);
            }
        }

        System.out.format("%.2f", stack.pop());
    }

    private static void calculate(Stack<Double> stack, double num1, double num2, char operation) {
        switch (operation) {
            case '+' :
                stack.push(num2 + num1);
                break;
            case '-' :
                stack.push(num2 - num1);
                break;
            case '*' :
                stack.push(num2 * num1);
                break;
            case '/' :
                stack.push(num2 / num1);
                break;
        }
    }
}
