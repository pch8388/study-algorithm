package me.boj.bruteforce.ps_6064;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalendarTest {

    @Test
    void solve() {
        int r1 = Calendar.solve(10, 12, 3, 9);
        int r2 = Calendar.solve(10, 12, 7, 2);
        int r3 = Calendar.solve(13, 11, 5, 6);
        int r4 = Calendar.solve(1, 5, 1, 3);

        assertThat(r1).isEqualTo(33);
        assertThat(r2).isEqualTo(-1);
        assertThat(r3).isEqualTo(83);
        assertThat(r4).isEqualTo(3);
    }

}