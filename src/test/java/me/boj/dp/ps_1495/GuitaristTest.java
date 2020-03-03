package me.boj.dp.ps_1495;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GuitaristTest {

    @Test
    void solve() {
        int r1 = Guitarist.solve(3, 5, 10, new int[]{5, 3, 7});

        assertThat(r1).isEqualTo(10);
    }

}