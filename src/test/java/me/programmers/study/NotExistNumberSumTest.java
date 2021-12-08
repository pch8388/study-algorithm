package me.programmers.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotExistNumberSumTest {

    @Test
    void sum() {
        final int r1 = NotExistNumberSum.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        final int r2 = NotExistNumberSum.solution(new int[]{5, 8, 4, 0, 6, 7, 9});

        assertEquals(14, r1);
        assertEquals(6, r2);
    }
}