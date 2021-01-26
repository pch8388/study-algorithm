package me.programmers.etc.ps_12909;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketTest {

    @Test
    void solve() {
        Bracket b = new Bracket();
        final boolean r1 = b.solution("()()");
        final boolean r2 = b.solution("(())()");
        final boolean r3 = b.solution(")()(");
        final boolean r4 = b.solution("(()(");

        assertTrue(r1);
        assertTrue(r2);
        assertFalse(r3);
        assertFalse(r4);
    }
}