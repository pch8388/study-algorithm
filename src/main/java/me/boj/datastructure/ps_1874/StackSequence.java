package me.boj.datastructure.ps_1874;

import java.io.*;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());
        int count = 1;
        int top = 0;
        int[] arr = new int[N];
        boolean isEnd = false;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(reader.readLine());
            if (isEnd) {
                continue;
            }
            while (count <= x) {
                arr[top++] = count++;
                builder.append('+').append('\n');
            }
            if (top != 0 && arr[top - 1] == x) {
                arr[--top] = 0;
                builder.append('-').append('\n');
            } else {
                builder.setLength(0);
                builder.append("NO");
                isEnd = true;
            }
        }
        System.out.println(builder);
        reader.close();
    }
}
