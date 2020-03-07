package me.boj.graph.ps_13023;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ABCDETest {
    @Test
    void solve() {
        int r1 = ABCDE.solve(5, 4, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}});
        int r2 = ABCDE.solve(5, 5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {1, 4}});
        int r3 = ABCDE.solve(6, 5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}});
        int r4 = ABCDE.solve(8, 8, new int[][]{{1, 7}, {3, 7}, {4, 7}, {3, 4}, {4, 6}, {3, 5}, {0, 4}, {2, 7}});

        assertThat(r1).isEqualTo(1);
        assertThat(r2).isEqualTo(1);
        assertThat(r3).isEqualTo(0);
        assertThat(r4).isEqualTo(1);
    }

}