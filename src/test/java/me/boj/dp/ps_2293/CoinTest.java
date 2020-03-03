package me.boj.dp.ps_2293;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinTest {
    @Test
    void solve() {
        int r1 = Coin.solve(3, 10, new int[]{1, 2, 5});

        assertThat(r1).isEqualTo(10);
    }
}