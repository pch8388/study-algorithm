package me.boj.dp.ps_11722;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecrementTest {

    @Test
    void solve() {
        int r1 = Decrement.solve(6, new int[]{10, 30, 10, 20, 20, 10});
        int r2 = Decrement.solve(5, new int[]{7, 5, 3, 1, 10});
        int r3 = Decrement.solve(7, new int[]{5, 4, 3, 2, 30, 20, 1});

        assertThat(r1).isEqualTo(3);
        assertThat(r2).isEqualTo(4);
        assertThat(r3).isEqualTo(5);
    }

}