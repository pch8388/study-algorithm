package me.programmers.kakao.ps_60057;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void solve() {
        StringCompression compression = new StringCompression();
        final int r1 = compression.solution("aabbaccc");
        final int r2 = compression.solution("ababcdcdababcdcd");
        final int r3 = compression.solution("abcabcdede");
        final int r4 = compression.solution("abcabcabcabcdededededede");
        final int r5 = compression.solution("xababcdcdababcdcd");

        assertEquals(7, r1);
        assertEquals(9, r2);
        assertEquals(8, r3);
        assertEquals(14, r4);
        assertEquals(17, r5);
    }

}