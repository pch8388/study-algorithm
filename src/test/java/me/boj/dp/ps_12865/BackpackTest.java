package me.boj.dp.ps_12865;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BackpackTest {

    @Test
    void solve() {
        int r1 = Backpack.solve(4, 5, new int[]{0, 1, 1, 3, 4}, new int[]{0, 4, 8, 3, 8});
        int r2 = Backpack.solve(4, 7, new int[]{0, 6, 4, 3, 5}, new int[]{0, 13, 8, 6, 12});
        int r3 = Backpack.solve(5, 104, new int[]{0, 3, 103, 2, 99, 98}, new int[]{0, 90, 89, 87, 86, 85});
        int r4 = Backpack.solve(5, 10, new int[]{0, 1, 1, 1, 1, 1}, new int[]{0, 1, 2, 3, 4, 5});
        int r5 = Backpack.solve(4, 3, new int[]{0, 6, 4, 3, 5}, new int[]{0, 13, 8, 6, 12});
        int r6 = Backpack.solve(4, 3, new int[]{0, 1, 2, 1, 2}, new int[]{0, 13, 8, 6, 12});

        assertThat(r1).isEqualTo(16);
        assertThat(r2).isEqualTo(14);
        assertThat(r3).isEqualTo(263);
        assertThat(r4).isEqualTo(15);
        assertThat(r5).isEqualTo(6);
        assertThat(r6).isEqualTo(25);
    }
}