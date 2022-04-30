package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void solve() {
        PlusOne p = new PlusOne();
        int[] r1 = p.plusOne(new int[]{1, 2, 3});
        int[] r2 = p.plusOne(new int[]{4, 3, 2, 1});
        int[] r3 = p.plusOne(new int[]{9});
        int[] r4 = p.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        int[] r5 = p.plusOne(new int[]{6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3});

        assertAll(
                () -> assertArrayEquals(new int[]{1, 2, 4}, r1),
                () -> assertArrayEquals(new int[]{4, 3, 2, 2}, r2),
                () -> assertArrayEquals(new int[]{1, 0}, r3),
                () -> assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, r4),
                () -> assertArrayEquals(new int[]{6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 4}, r5)
        );
    }
}