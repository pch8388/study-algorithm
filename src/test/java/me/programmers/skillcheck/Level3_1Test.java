package me.programmers.skillcheck;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Level3_1Test {

    @Test
    void solve() {
        Level3_1 l = new Level3_1();

        long r1 = l.solution(4);
        long r2 = l.solution(3);

        assertThat(r1).isEqualTo(5);
        assertThat(r2).isEqualTo(3);
    }
}