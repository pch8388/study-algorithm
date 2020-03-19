package me.boj.graph.tree.ps_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[26];

        for (int i = 1; i <= n; i++) {
            char[] c = br.readLine().replaceAll(" ", "").toCharArray();

            int x = c[0] - 'A';
            char left = c[1];
            char right = c[2];

            int l = -1;
            int r = -1;

            if (left != '.') {
                l = left - 'A';
            }

            if (right != '.') {
                r = right - 'A';
            }

            nodes[x] = new Node(l, r);
        }

        preOrder(nodes, 0);
        sb.append("\n");
        inOrder(nodes, 0);
        sb.append("\n");
        postOrder(nodes, 0);
        System.out.println(sb);
    }

    static StringBuilder sb = new StringBuilder();

    static void preOrder(Node[] node, int x) {
        if (x == -1) return;
        sb.append((char) (x + 'A'));
        preOrder(node, node[x].l);
        preOrder(node, node[x].r);
    }

    static void inOrder(Node[] node, int x) {
        if (x == -1) return;
        inOrder(node, node[x].l);
        sb.append((char) (x + 'A'));
        inOrder(node, node[x].r);
    }

    static void postOrder(Node[] node, int x) {
        if (x == -1) return;
        postOrder(node, node[x].l);
        postOrder(node, node[x].r);
        sb.append((char) (x + 'A'));
    }
}

class Node {
    int l, r;

    public Node(int l, int r) {
        this.l = l;
        this.r = r;
    }
}