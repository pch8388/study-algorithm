package me.boj.dp.ps_1309;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ZooTest {

    @Test
    void solve() {
        int r1 = Zoo.solve(4);

        assertThat(r1).isEqualTo(41);
    }

}