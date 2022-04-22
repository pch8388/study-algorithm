package me.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FourSumTest {

    @Test
    void solve() {
        FourSum sum = new FourSum();
        List<List<Integer>> r1 = sum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        assertThat(r1)
            .containsExactlyInAnyOrder(
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2,0,0,2),
                Arrays.asList(-1,0,0,1)
            );
    }
}