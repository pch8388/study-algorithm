package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerWithMostWaterTest {

    @Test
    public void solve() {
        ContainerWithMostWater w = new ContainerWithMostWater();
        final int r1 = w.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        final int r2 = w.maxArea(new int[]{1, 1});

        assertThat(r1).isEqualTo(49);
        assertThat(r2).isEqualTo(1);
    }
}