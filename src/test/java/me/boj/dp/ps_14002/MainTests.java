package me.boj.dp.ps_14002;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTests {
    @Test
    void solve() {
        int[] r1 = Main.solve(6, new int[]{10, 20, 10, 30, 20, 50});

        assertThat(r1).contains(10, 20, 30, 50);
    }
}