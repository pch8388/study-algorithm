package me.programmers.skillcheck.level3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test1Test {

    @Test
    void solve() {
        Test1 t = new Test1();
        int r1 = t.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        int r2 = t.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});

        assertThat(r1).isEqualTo(2);
        assertThat(r2).isEqualTo(1);
    }
}