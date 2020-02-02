package me.boj.dp.ps_11055;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncreamentTest {

    @Test
    void solve() {
        int r1 = Increament.solve(10, new int[]{1, 100, 2, 50, 60, 3, 5, 6, 7, 8});

        assertThat(r1).isEqualTo(113);
    }
}