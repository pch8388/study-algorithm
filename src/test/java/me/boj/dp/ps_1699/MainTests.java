package me.boj.dp.ps_1699;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTests {
    @Test
    void solve() {
        int r1 = Main.solve(7);

        assertThat(r1).isEqualTo(4);
    }
}