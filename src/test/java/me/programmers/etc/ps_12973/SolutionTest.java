package me.programmers.etc.ps_12973;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        int r1 = solution.solution("baabaa");
        int r2 = solution.solution("cdcd");

        assertEquals(1, r1);
        assertEquals(0, r2);
    }
}