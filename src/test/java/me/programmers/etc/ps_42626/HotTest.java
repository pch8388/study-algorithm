package me.programmers.etc.ps_42626;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HotTest {
    @Test
    void solve() {
        Hot hot = new Hot();
        final int r1 = hot.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);

        assertEquals(2, r1);
    }
}
