package me.boj.dp.ps_11054;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BitonicTest {
    @Test
    void solve() {
        int r1 = Bitonic.solve(10, new int[]{1, 5, 2, 1, 4, 3, 4, 5, 2, 1});
        int r2 = Bitonic.solve(17, new int[]{7, 2, 1, 1, 5, 2, 2, 3, 2, 3, 1, 2, 4, 5, 1, 2, 4});

        assertThat(r1).isEqualTo(7);
        assertThat(r2).isEqualTo(6);
    }
}