package me.programmers.dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerTriangleTest {
    @Test
    void solve() {
        int r1 = IntegerTriangle.solution(new int[][] { {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5} });

        assertThat(r1).isEqualTo(30);
    }
}