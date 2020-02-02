package me.boj.dp.ps_2156;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WineTest {

    @Test
    void solve() {
        int r1 = Wine.solve(6, new int[]{0, 6, 10, 13, 9, 8, 1});

        assertThat(r1).isEqualTo(33);
    }

}