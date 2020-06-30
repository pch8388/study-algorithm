package me.hackerrank;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int[] map = new int[101];
        for (Integer i : a) {
            map[i]++;
        }
        int max = 0;
        for (int i = 0; i < map.length; i++) {
            max = Math.max(max, map[i]);
        }
        Queue<Integer> queue = new LinkedList<>(a);
        int prev = queue.remove();

        while (!queue.isEmpty()) {
            final Integer i = queue.remove();
            if (i - prev == 1) {
                max = Math.max(max, map[prev] + map[i]);
            }
            prev = i;
        }
        return max;
    }
}
