package me.programmers.etc.ps_12914;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongJumpTest {

    @Test
    void solve() {
        LongJump l = new LongJump();
        final long r1 = l.solution(3);
        final long r2 = l.solution(4);

        assertEquals(3, r1);
        assertEquals(5, r2);
    }
}