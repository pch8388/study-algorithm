package me.leetcode;

import me.codility.lesson4.MissingInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void solve() {
        MissingInteger m = new MissingInteger();
        final int r1 = m.solution(new int[]{1, 3, 6, 4, 1, 2});
        final int r2 = m.solution(new int[]{1, 2, 3});
        final int r3 = m.solution(new int[]{-3, -1});
        final int r4 = m.solution(new int[]{-3, -1, 1, 9, 100, 200});

        assertEquals(r1, 5);
        assertEquals(r2, 4);
        assertEquals(r3, 1);
        assertEquals(r4, 2);
    }
}