package me.programmers.etc.ps_49189;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeDistanceTest {
    @Test
    void solve() {
        NodeDistance n = new NodeDistance();
        final int r1 = n.solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}});

        assertEquals(3, r1);
    }
}