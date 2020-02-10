package me.boj.dp.ps_11053;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTests {
    @Test
    void test() {
        int r1 = Main.solve(6, new int[]{10, 20, 10, 30, 20, 50});
        int r2 = Main.solve(4, new int[]{1, 4, 2, 3});
        int r3 = Main.solve(7, new int[]{8, 9, 10, 1, 2, 3, 4});
        int r4 = Main.solve(7, new int[]{1, 4, 5, 2, 3, 4, 5});
        int r5 = Main.solve(1, new int[]{2});
        int r6 = Main.solve(4, new int[]{1, 4, 2, 3});
        int r7 = Main.solve(16, new int[]{8, 6, 9, 1, 4, 6, 7, 4, 3, 7, 4, 7, 2, 5, 2, 10});

        assertThat(r1).isEqualTo(4);
        assertThat(r2).isEqualTo(3);
        assertThat(r3).isEqualTo(4);
        assertThat(r4).isEqualTo(5);
        assertThat(r5).isEqualTo(1);
        assertThat(r6).isEqualTo(3);
        assertThat(r7).isEqualTo(5);
    }

}