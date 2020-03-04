package me.boj.bruteforce.ps_1182;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SubTest {
    @Test
    void solve() {
        int r1 = Sub.solve(5, 0, new int[]{-7, -3, -2, 5, 8});

        assertThat(r1).isEqualTo(1);
    }
}