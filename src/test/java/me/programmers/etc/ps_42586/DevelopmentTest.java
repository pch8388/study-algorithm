package me.programmers.etc.ps_42586;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevelopmentTest {

    @Test
    void solve() {
        Development d = new Development();
        final int[] r1 = d.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        final int[] r2 = d.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});

        assertArrayEquals(new int[]{2, 1}, r1);
        assertArrayEquals(new int[]{1, 3, 2}, r2);
    }
}