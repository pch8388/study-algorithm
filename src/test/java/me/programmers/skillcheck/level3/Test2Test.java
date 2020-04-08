package me.programmers.skillcheck.level3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test2Test {

    @Test
    void solve() {
        Test2 test2 = new Test2();
        int solution = test2.solution(new int[]{3, 1, 6, 2, 7, 30, 1});

        assertThat(solution).isEqualTo(21);
    }
}