package me.boj.bruteforce.ps_1748;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContinueNumberTest {

    @Test
    void solve() {
        int r1 = ContinueNumber.solve(120);

        assertThat(r1).isEqualTo(252);
    }

}