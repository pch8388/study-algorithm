package me.programmers.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailRateTest {

    @Test
    void solution() {
        FailRate failRate = new FailRate();
        final int[] r1 = failRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        final int[] r2 = failRate.solution(4, new int[]{4, 4, 4, 4, 4});

        assertArrayEquals(new int[] {3, 4, 2, 1, 5}, r1);
        assertArrayEquals(new int[] {4, 1, 2, 3}, r2);
    }
}