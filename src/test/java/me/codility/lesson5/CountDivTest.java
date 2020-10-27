package me.codility.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    @Test
    void solve() {
        CountDiv c = new CountDiv();
        final int r1 = c.solution(6, 11, 2);
        final int r2 = c.solution(6, 11, 3);
        final int r3 = c.solution(1, 11, 2);
        final int r4 = c.solution(1, 11, 3);
        final int r5 = c.solution(11, 345, 17);

        assertEquals(r1, 3);
        assertEquals(r2, 2);
        assertEquals(r3, 5);
        assertEquals(r4, 3);
        assertEquals(r5, 20);
    }
}