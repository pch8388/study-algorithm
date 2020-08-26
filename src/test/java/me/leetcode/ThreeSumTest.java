package me.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {

    @Test
    void solve() {
        ThreeSum t = new ThreeSum();
        final List<List<Integer>> result1 = t.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertThat(result1).contains(Arrays.asList(-1, 0, 1), Arrays.asList(-1, -1, 2));
        assertThat(result1.size()).isEqualTo(2);

        final List<List<Integer>> result2 = t.threeSum(new int[]{0, 0, 0, 0});

        assertThat(result2).contains(Arrays.asList(0, 0, 0));
    }
}