package me.boj.dp.ps_11055;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncrementTest {

    @Test
    void solve() {
        int r1 = Increment.solve(10, new int[]{1, 100, 2, 50, 60, 3, 5, 6, 7, 8});
        int r2 = Increment.solve(5, new int[]{10, 90, 20, 80, 100});
        int r3 = Increment.solve(8, new int[]{3, 10, 2, 7, 11, 5, 13, 8});
        int r4 = Increment.solve(5, new int[]{5, 4, 3, 2, 1});
        int r5 = Increment.solve(1, new int[]{1});
        int r6 = Increment.solve(10, new int[]{100, 110, 90, 80, 70, 80, 90, 1, 2, 3});

        assertThat(r1).isEqualTo(113);
        assertThat(r2).isEqualTo(210);
        assertThat(r3).isEqualTo(37);
        assertThat(r4).isEqualTo(5);
        assertThat(r5).isEqualTo(1);
        assertThat(r6).isEqualTo(240);
    }
}