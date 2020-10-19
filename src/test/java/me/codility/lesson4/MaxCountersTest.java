package me.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxCountersTest {

    @Test
    void solve() {
        MaxCounters maxCounters = new MaxCounters();
        final int[] r1 = maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});

        assertThat(r1).containsExactly(3, 2, 2, 4, 2);
    }
}