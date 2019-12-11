package me.study.algo_1966;

import java.util.*;
import java.util.stream.Stream;

public class PrinterQueue {
    public static void main(String[] args) {
        //TODO :
        // 1.몇번의 test case 를 할지 첫째줄에서 받음(최초1회) - 2번부터 1의 갯수만큼 loop
        // 2.문서의 총 갯수(N), 확인하고 싶은 문서의 첫위치(M)
        // 3.실제 문서 우선순위
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
