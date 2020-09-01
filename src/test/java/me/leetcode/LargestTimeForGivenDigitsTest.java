package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestTimeForGivenDigitsTest {

    @Test
    void solve() {
        LargestTimeForGivenDigits l = new LargestTimeForGivenDigits();
        final String r1 = l.largestTimeFromDigits(new int[]{1, 2, 3, 4});
        final String r2 = l.largestTimeFromDigits(new int[]{5, 5, 5, 5});
        final String r3 = l.largestTimeFromDigits(new int[]{4, 1, 0, 0});

        assertEquals(r1, "23:41");
        assertEquals(r2, "");
        assertEquals(r3, "14:00");
    }
}