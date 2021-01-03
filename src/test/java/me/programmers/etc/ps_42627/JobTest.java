package me.programmers.etc.ps_42627;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JobTest {

    @Test
    void solve() {
        Job job = new Job();
        final int r1 = job.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
        final int r2 = job.solution(new int[][]{{0, 10}, {2, 10}, {9, 10}, {15, 2}});
        final int r3 = job.solution(new int[][]{{0, 10}, {2, 12}, {9, 19}, {15, 17}});
        final int r4 = job.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
        final int r5 = job.solution(new int[][]{{0, 1}});
        final int r6 = job.solution(new int[][]{{1000, 1000}});

        assertEquals(9, r1);
        assertEquals(14, r2);
        assertEquals(25, r3);
        assertEquals(9, r4);
        assertEquals(1, r5);
        assertEquals(1000, r6);
    }
}