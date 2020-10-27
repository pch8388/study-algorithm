package me.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    @Test
    void solve() {
        PermCheck p = new PermCheck();
        final int r1 = p.solution(new int[]{4, 1, 3, 2});
        final int r2 = p.solution(new int[]{4, 1, 3});
        final int r3 = p.solution(new int[]{1, 2, 3, 1, 2, 3});

        assertEquals(r1, 1);
        assertEquals(r2, 0);
        assertEquals(r3, 0);
    }
}