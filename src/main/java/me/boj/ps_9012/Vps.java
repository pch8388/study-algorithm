package me.boj.ps_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vps {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st.append(valid(bf.readLine())).append("\n");
        }
        System.out.println(st);
    }

    public static String valid(String in) {
        Stack stack = Stack.of(in.length());
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '(') {
                stack.push('(');
            }
            if (in.charAt(i) == ')') {
                char pop = stack.pop();
                if (pop == 'N') {
                    return "NO";
                }
            }
        }

        if (stack.size() > 0) {
            return  "NO";
        }
        return "YES";
    }
}

class Stack {
    private char[] arr;
    private int top;

    private Stack(int size) {
        arr = new char[size];
        top = 0;
    }

    public static Stack of(int size) {
        return new Stack(size);
    }

    public void push(char c) {
        arr[top++] = c;
    }

    public char pop() {
        if (empty()) {
            return 'N';
        }
        return arr[--top];
    }

    public int size() {
        return top;
    }

    private boolean empty() {
        return top == 0;
    }
}