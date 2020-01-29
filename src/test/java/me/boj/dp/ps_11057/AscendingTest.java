package me.boj.dp.ps_11057;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AscendingTest {

    @Test
    void solve() {
        int r1 = Ascending.solve(1);
        int r2 = Ascending.solve(2);
        int r3 = Ascending.solve(3);

        assertThat(r1).isEqualTo(10);
        assertThat(r2).isEqualTo(55);
        assertThat(r3).isEqualTo(220);
    }
}