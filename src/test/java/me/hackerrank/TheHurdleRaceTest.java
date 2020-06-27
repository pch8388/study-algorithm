package me.hackerrank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TheHurdleRaceTest {

    @Test
    public void solve() {
        final int r1 = TheHurdleRace.hurdleRace(4, new int[]{1, 6, 3, 5, 2});
        final int r2 = TheHurdleRace.hurdleRace(7, new int[]{2, 5, 4, 5, 2});

        assertThat(r1).isEqualTo(2);
        assertThat(r2).isEqualTo(0);
    }
}