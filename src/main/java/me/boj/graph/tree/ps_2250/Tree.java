package me.boj.graph.tree.ps_2250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {

    static final int MAX = 10001;
    static Node[] nodes = new Node[MAX];
    static int[] left = new int[MAX];
    static int[] right = new int[MAX];
    static int[] cnt = new int[MAX];
    static int order = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            int x = Integer.parseInt(strings[0]);
            int y = Integer.parseInt(strings[1]);
            int z = Integer.parseInt(strings[2]);
            nodes[x] = new Node(y, z);
            if (y != -1) cnt[y] += 1;
            if (z != -1) cnt[z] += 1;
        }

        int root = 0;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == 0) {
                root = i;
                break;
            }
        }
        inorder(root, 1);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int depth = nodes[i].depth;
            int order = nodes[i].order;
            if (left[depth] == 0) {
                left[depth] = order;
            } else {
                left[depth] = Math.min(left[depth], order);
            }
            right[depth] = Math.max(right[depth], order);
            max = Math.max(max, depth);
        }

        int ans = 0;
        int level = 0;
        for (int i = 1; i <= max; i++) {
            if (ans < right[i] - left[i] + 1) {
                ans = right[i] - left[i] + 1;
                level = i;
            }
        }
        System.out.println(level + " " + ans);
    }

    static void inorder(int node, int depth) {
        if (node == -1) return;
        inorder(nodes[node].left, depth + 1);
        nodes[node].order = ++order;
        nodes[node].depth = depth;
        inorder(nodes[node].right, depth + 1);
    }
}

class Node {
    int left, right;
    int order, depth;

    public Node(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
