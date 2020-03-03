package me.boj.dp.ps_1010;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BridgeTest {

    @Test
    void solve() {
        int r1 = Bridge.solve(2, 2);
        int r2 = Bridge.solve(1, 5);
        int r3 = Bridge.solve(13, 29);

        assertThat(r1).isEqualTo(1);
        assertThat(r2).isEqualTo(5);
        assertThat(r3).isEqualTo(67863915);
    }
}