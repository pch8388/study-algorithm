package me.boj.dp.ps_13398;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContinusSum2Test {

    @Test
    void solve() {
        int r1 = ContinusSum2.solve(10, new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1});

        assertThat(r1).isEqualTo(54);
    }

}