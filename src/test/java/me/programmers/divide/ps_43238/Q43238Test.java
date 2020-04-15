package me.programmers.divide.ps_43238;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q43238Test {

    @Test
    void solve() {
        Q43238 q = new Q43238();
        long solution = q.solution(6, new int[]{7, 10});

        assertThat(solution).isEqualTo(28);
    }
}