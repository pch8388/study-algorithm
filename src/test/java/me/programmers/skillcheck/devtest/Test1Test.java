package me.programmers.skillcheck.devtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test1Test {
    @Test
    void solve() {
        Test1 t = new Test1();

        int r1 = t.solution(new int[][]{{5, -1, 4}, {6, 3, -1}, {2, -1, 1}}, 1, 0,
            new String[]{"go", "go", "right", "go", "right", "go", "left", "go"});

        assertThat(r1).isEqualTo(14);
    }
}