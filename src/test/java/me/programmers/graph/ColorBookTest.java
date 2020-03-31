package me.programmers.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColorBookTest {

    @Test
    void solve() {
        ColorBook c = new ColorBook();

        int[] solution = c.solution(6, 4,
            new int[][]{{1, 1, 1, 0},
                        {1, 2, 2, 0},
                        {1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 3},
                        {0, 0, 0, 3}});

        assertThat(solution).containsExactly(4, 5);
    }
}