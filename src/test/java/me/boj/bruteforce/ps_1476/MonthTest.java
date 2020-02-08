package me.boj.bruteforce.ps_1476;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonthTest {

    @Test
    void solve() {
        int r1 = Month.solve(1, 16, 16);
        int r2 = Month.solve(1, 1, 1);
        int r3 = Month.solve(1, 2, 3);
        int r4 = Month.solve(15, 28, 19);

        assertThat(r1).isEqualTo(16);
        assertThat(r2).isEqualTo(1);
        assertThat(r3).isEqualTo(5266);
        assertThat(r4).isEqualTo(7980);
    }
}