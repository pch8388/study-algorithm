package me.boj.dp.ps_1912;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContinusSumTests {
    @Test
    void solve() {
        int r1 = ContinusSum.solve(new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1});
        int r2 = ContinusSum.solve(new int[]{-1, -1});
        int r3 = ContinusSum.solve(new int[]{-1, -2, -3, -4, -5});
        int r4 = ContinusSum.solve(new int[]{3, 9, -8, 6, 4, -7, 5, -4, 4, -2, 5});
        int r5 = ContinusSum.solve(new int[]{10, -4, 3, 1, 5, 6, -35, 12, 1, -1});

        assertThat(r1).isEqualTo(33);
        assertThat(r2).isEqualTo(-1);
        assertThat(r3).isEqualTo(-1);
        assertThat(r4).isEqualTo(15);
        assertThat(r5).isEqualTo(21);
    }
}