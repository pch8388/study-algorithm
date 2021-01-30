package me.programmers.etc.ps_42584;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockPriceTest {

    @Test
    void solve() {
        StockPrice s = new StockPrice();
        final int[] r1 = s.solution(new int[]{1, 2, 3, 2, 3});

        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, r1);
    }
}