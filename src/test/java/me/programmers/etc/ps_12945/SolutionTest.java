package me.programmers.etc.ps_12945;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution s = new Solution();
        int r1 = s.solution(3);
        int r2 = s.solution(5);

        assertEquals(2, r1);
        assertEquals(5, r2);
    }
}