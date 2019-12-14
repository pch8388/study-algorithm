package me.study.algo_5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyLogger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(translate(reader.readLine())).append("\n");
        }
        System.out.println(builder);
    }

    public static String translate(String str) {
        int length = str.length();
        KeyStack keyStack1 = new KeyStack(length);
        KeyStack keyStack2 = new KeyStack(length);

        char empty = '\u0000';

        for (char c : str.toCharArray()) {
            switch (c) {
                case '>':

                    char c1 = keyStack2.pop();
                    if (c1 != empty) {
                        keyStack1.push(c1);
                    }
                    break;
                case '<':
                    char c2 = keyStack1.pop();
                    if (c2 != empty) {
                        keyStack2.push(c2);
                    }
                    break;
                case '-':
                    keyStack1.pop();
                    break;
                default:
                    keyStack1.push(c);
            }

        }

        if (keyStack2.isNotEmpty()) {
            keyStack1.push(keyStack2);
        }
        return keyStack1.printStack();
    }
}

class KeyStack {
    private int index;
    private char[] arr;

    public KeyStack(int n) {
        this.index = -1;
        arr = new char[n];
    }

    boolean isNotEmpty() {
        return index >= 0;
    }

    void push(char c) {
        arr[++index] = c;
    }

    void push(KeyStack keyStack) {
        while (keyStack.isNotEmpty()) {
            push(keyStack.pop());
        }
    }

    char pop() {
        if (index < 0) {
            return '\u0000';
        }
        return arr[index--];
    }

    String printStack() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            result.append(arr[i]);
        }
        return result.toString();
    }
}

