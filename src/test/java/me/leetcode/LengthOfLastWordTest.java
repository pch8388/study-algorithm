package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    @Test
    void solve() {
        LengthOfLastWord w = new LengthOfLastWord();
        int r1 = w.lengthOfLastWord("Hello World");
        int r2 = w.lengthOfLastWord("   fly me   to   the moon  ");
        int r3 = w.lengthOfLastWord("luffy is still joyboy");

        assertAll(
            () -> assertEquals(5, r1),
            () -> assertEquals(4, r2),
            () -> assertEquals(6, r3)
        );

    }
}