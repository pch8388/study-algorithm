package me.programmers.etc.ps_42628;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublePriorityQueueTest {

    @Test
    void solve() {
        DoublePriorityQueue queue = new DoublePriorityQueue();
        final int[] r1 = queue.solution(new String[]{"I 16", "D 1"});
        final int[] r2 = queue.solution(new String[]{"I 7", "I 5", "I -5", "D -1"});

        assertArrayEquals(new int[]{0, 0}, r1);
        assertArrayEquals(new int[]{7, 5}, r2);
    }
}