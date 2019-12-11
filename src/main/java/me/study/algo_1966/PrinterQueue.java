package me.study.algo_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(bf.readLine());
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < testCount; i++) {
            String[] s = bf.readLine().split(" ");
            int[] arr = Arrays.stream(bf.readLine().split(" "))
                                .map(Integer::parseInt)
                                .mapToInt(x -> x)
                                .toArray();

            str.append(search(arr, Integer.parseInt(s[1]))).append("\n");
        }

        System.out.print(str);
    }

    public static int search(int[] arr, int start) {
        int maxValue = Arrays.stream(arr).max().getAsInt();
        Queue<Node> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(new Node(i, arr[i]));
        }

        int result = 0;
        while (true) {
            Node current = list.poll();
            if (current.data == maxValue) {
                result++;
                if (current.index == start) {
                    return result;
                } else {
                    maxValue = list.stream()
                        .map(node -> node.data)
                        .max(Integer::compareTo)
                        .get();
                }
            } else {
                list.add(current);
            }
        }
    }

    static class Node {
        int index;
        int data;

        Node(int index, int data) {
            this.index = index;
            this.data = data;
        }
    }
}
