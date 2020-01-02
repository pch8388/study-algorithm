package me.boj.ps_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StackMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Stack stack = Stack.of(N);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String op = st.nextToken();
            switch (op) {
                case "push" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    stringBuilder.append(stack.pop()).append("\n");
                    break;
                case "size" :
                    stringBuilder.append(stack.size()).append("\n");
                    break;
                case "empty" :
                    stringBuilder.append(stack.empty() ? 1 : 0).append("\n");
                    break;
                case "top" :
                    stringBuilder.append(stack.top()).append("\n");
            }
        }

        System.out.println(stringBuilder);
    }
}

class Stack {
    private int[] stack;
    private int top;

    private Stack(int size) {
        stack = new int[size];
        top = 0;
    }

    public static Stack of(int size) {
        return new Stack(size);
    }

    public int[] push(int element) {
        stack[top++] = element;
        return stack;
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        top--;
        return stack[top];
    }

    public boolean empty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public int top() {
        if (empty()) {
            return -1;
        }
        return stack[top - 1];
    }
}
