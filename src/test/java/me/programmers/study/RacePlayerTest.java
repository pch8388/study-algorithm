package me.programmers.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacePlayerTest {

    @Test
    void solution() {
        RacePlayer racePlayer = new RacePlayer();
        final String r1 = racePlayer.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});

        assertEquals("leo", r1);
    }
}