package me.programmers.greedy.ps_42861;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Island {

    static int[] array;
    static int[] rank;
    public int solution(int n, int[][] costs) {
        List<Node> graph = new ArrayList<>();

        for (int[] arr : costs) {
            graph.add(new Node(arr[0], arr[1], arr[2]));
        }

        array = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        Collections.sort(graph);

        int answer = 0;
        for (int i = 0; i < graph.size(); i++) {
            Node node = graph.get(i);
            if (union(node.x, node.y)) {
                answer += node.cost;
            }

        }

        return answer;
    }

    private int find(int x) {
        if (array[x] == x) {
            return x;
        } else {
            return array[x] = find(array[x]);
        }
    }

    private boolean union(int x, int y) {
        x = find(x);
        y = find(y);

       if(x == y) return false;

       if(rank[x] < rank[y]) {
            array[x] = y;
        } else {
            array[y] = x;

            if(rank[x] == rank[y]) {
                rank[x]++;
            }
        }

       return true;
    }

}

class Node implements Comparable<Node> {
    int x, y, cost;

    public Node(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node node) {
        if (cost > node.cost) {
            return 1;
        } else if (cost < node.cost) {
            return -1;
        }

        return 0;
    }
}

