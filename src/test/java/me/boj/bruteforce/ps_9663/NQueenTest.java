package me.boj.bruteforce.ps_9663;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NQueenTest {

    @Test
    void solve() {
        int r1 = NQueen.solve(8);
        int r2 = NQueen.solve(4);

        assertThat(r1).isEqualTo(92);
        assertThat(r2).isEqualTo(2);
    }
}