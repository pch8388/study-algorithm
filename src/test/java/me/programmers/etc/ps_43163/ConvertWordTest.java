package me.programmers.etc.ps_43163;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertWordTest {

    @Test
    void solve() {
        ConvertWord convertWord = new ConvertWord();
        final int r1 = convertWord.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        final int r2 = convertWord.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"});

        assertEquals(4, r1);
        assertEquals(0, r2);
    }
}