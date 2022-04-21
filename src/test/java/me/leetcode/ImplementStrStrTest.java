package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    @Test
    void solve() {
        ImplementStrStr solution = new ImplementStrStr();
        int r1 = solution.strStr("hello", "ll");
        int r2 = solution.strStr("aaaaa", "bba");
        int r3 = solution.strStr("mississippi", "issip");
        int r4 = solution.strStr("a", "a");

        assertEquals(2, r1);
        assertEquals(-1, r2);
        assertEquals(4, r3);
        assertEquals(0, r4);
    }

}