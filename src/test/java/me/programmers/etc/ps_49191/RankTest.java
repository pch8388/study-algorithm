package me.programmers.etc.ps_49191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RankTest {

    @Test
    void solve() {
        Rank r = new Rank();
        final int r1 = r.solution(5, new int[][]{{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}});
        final int r2 = r.solution(5, new int[][]{{4, 3}, {4, 2}, {3, 2}, {2, 5}, {1, 2}});

        assertEquals(2, r1);
        assertEquals(2, r2);
    }
}