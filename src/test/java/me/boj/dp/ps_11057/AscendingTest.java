package me.boj.dp.ps_11057;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AscendingTest {

    @Test
    void solve() {
        long r1 = Ascending.solve(1);
        long r2 = Ascending.solve(2);
        long r3 = Ascending.solve(3);

        assertThat(r1).isEqualTo(10);
        assertThat(r2).isEqualTo(55);
        assertThat(r3).isEqualTo(220);
    }
}