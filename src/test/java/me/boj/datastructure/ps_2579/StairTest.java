package me.boj.datastructure.ps_2579;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StairTest {
    @Test
    void solve() {
        int r1 = Stair.solve(6, new int[]{10, 20, 15, 25, 10, 20});

        assertThat(r1).isEqualTo(75);
    }

}