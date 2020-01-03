package me.boj.datastructure.ps_1406;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String s = reader.readLine();
        for (int i = 0; i < s.length(); i++) {
            left.push(s.charAt(i));
        }

        int m = Integer.parseInt(reader.readLine());
        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String op = st.nextToken();
            switch (op) {
                case "L" :
                    if (!left.empty()) {
                        right.push(left.pop());
                    }
                    break;
                case "D" :
                    if (!right.empty()) {
                        left.push(right.pop());
                    }
                    break;
                case "B" :
                    if (!left.empty()) {
                        left.pop();
                    }
                    break;
                case "P" :
                    left.push(st.nextToken().charAt(0));
                    break;
            }
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (!left.empty()) {
            right.push(left.pop());
        }
        while (!right.empty()) {
            writer.append(right.pop());
        }
        writer.close();
        reader.close();
    }
}
