package me.programmers.bruteforce.ps_42895;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solve() {
        Solution solution = new Solution();
        int r1 = solution.solution(5, 12);
        int r2 = solution.solution(2, 11);

        assertThat(r1).isEqualTo(4);
        assertThat(r2).isEqualTo(3);
    }
}