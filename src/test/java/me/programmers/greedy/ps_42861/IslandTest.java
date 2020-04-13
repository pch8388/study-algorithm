package me.programmers.greedy.ps_42861;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IslandTest {

    @Test
    void solve() {
        Island island = new Island();
        int r1 = island.solution(4, new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}});
        int r2 = island.solution(5, new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 3}, {2, 3, 8}, {3, 4, 1}});

        assertThat(r1).isEqualTo(4);
        assertThat(r2).isEqualTo(7);
    }
}