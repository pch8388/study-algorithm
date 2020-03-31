package me.programmers.skillcheck;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Level2_1Test {

    @Test
    void solve() {
        Level2_1 l = new Level2_1();

        int[] r1 = l.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

        assertThat(r1).containsExactly(2, 1);
    }

}