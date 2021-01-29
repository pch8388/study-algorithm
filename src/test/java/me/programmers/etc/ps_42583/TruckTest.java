package me.programmers.etc.ps_42583;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    void solve() {
        Truck truck = new Truck();
        final int r1 = truck.solution(2, 10, new int[]{7, 4, 5, 6});
        final int r2 = truck.solution(100, 100, new int[]{10});
        final int r3 = truck.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10});

        assertEquals(8, r1);
        assertEquals(101, r2);
        assertEquals(110, r3);
    }
}