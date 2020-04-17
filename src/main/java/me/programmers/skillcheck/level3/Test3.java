package me.programmers.skillcheck.level3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public int solution(String dirs) {
        final int MAX = 11;
        int len = dirs.length();
        int x = 5;
        int y = 5;

        List<List<List<Node>>> list = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < MAX; j++) {
                list.get(i).add(new ArrayList<>());
            }
        }

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            int px = x;
            int py = y;
            char c = dirs.charAt(i);
            switch (c) {
                case 'U':
                    if (y - 1 >= 0) {
                        y -= 1;
                        cnt = tmp(x, y, list, cnt, px, py);
                    }
                    break;
                case 'D':
                    if (y + 1 < MAX) {
                        y += 1;
                        cnt = tmp(x, y, list, cnt, px, py);
                    }
                    break;
                case 'R':
                    if (x + 1 < MAX) {
                        x += 1;
                        cnt = tmp(x, y, list, cnt, px, py);
                    }
                    break;
                case 'L':
                    if (x - 1 >= 0) {
                        x -= 1;
                        cnt = tmp(x, y, list, cnt, px, py);
                    }
                    break;
            }

        }
        return cnt;
    }

    private int tmp(int x, int y, List<List<List<Node>>> list, int cnt, int px, int py) {
        List<Node> nodes = list.get(px).get(py);
        boolean b = false;
        for (Node node : nodes) {
            if (b) {
                break;
            }
            if (x == node.x && y == node.y) {
                b = true;
            }
        }
        if (!b) {
            nodes.add(new Node(x, y));
            cnt++;
            list.get(x).get(y).add(new Node(px, py));
        }
        return cnt;
    }
}

class Node {
    int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
