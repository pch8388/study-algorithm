package me.programmers.skillcheck.level3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test4Test {

    @Test
    void solve() {
        Test4 test = new Test4();

        long r1 = test.solution(4, new int[]{4, 3, 3});
        long r2 = test.solution(1, new int[]{2, 1, 2});
        long r3 = test.solution(3, new int[]{1, 1});

        assertThat(r1).isEqualTo(12);
        assertThat(r2).isEqualTo(6);
        assertThat(r3).isEqualTo(0);
    }
}