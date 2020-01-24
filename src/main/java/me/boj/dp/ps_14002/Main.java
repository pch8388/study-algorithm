package me.boj.dp.ps_14002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] solve = solve(n, arr);
        System.out.println(solve.length);
        for (int r : solve) {
            System.out.print(r + " ");
        }
    }
    static int[] solve(int n, int[] arr) {
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(arr[i]);
            nodes[i].setMax(1);
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && nodes[i].getMax() < nodes[j].getMax() + 1) {
                    nodes[i].addPreNode(nodes[j]);
                    nodes[i].setMax(nodes[j].getMax() + 1);
                }
            }
        }

        int max = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (max < nodes[i].getMax()) {
                max = nodes[i].getMax();
                x = i;
            }
        }

        int[] result = new int[max];
        Node node = nodes[x];
        int i = 0;
        while (true) {
            result[i++] = node.getData();
            if (node.findPre() == null) {
                break;
            }
            node = node.findPre();
        }

        Arrays.sort(result);

        return result;
    }

    static class Node {
        private int data;
        private int max;
        private Node pre;

        Node(int data) {
            this.data = data;
            this.pre = null;
        }

        public void addPreNode(Node node) {
            this.pre = node;
        }

        public Node findPre() {
            return pre;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
