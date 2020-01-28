package me.boj.dp.ps_1149;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RGBTest {
    @Test
    void solve() {
        int r1 = RGB.solve(3, new int[][]{{26, 40, 83}, {49, 60, 57}, {13, 89, 99}});
        int r2 = RGB.solve(3, new int[][]{{1, 115, 115}, {3, 10, 999}, {999, 999, 1}});
        int r3 = RGB.solve(5, new int[][]{{5, 4, 4}, {2, 2, 3}, {3, 2, 2}, {2, 1, 2}, {1, 3, 1}});

        assertThat(r1).isEqualTo(96);
        assertThat(r2).isEqualTo(12);
        assertThat(r3).isEqualTo(10);
    }

}