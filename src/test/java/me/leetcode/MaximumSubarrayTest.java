package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void solve() {
        MaximumSubarray s = new MaximumSubarray();
        int r1 = s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        int r2 = s.maxSubArray(new int[]{1});
        int r3 = s.maxSubArray(new int[]{23});

        assertEquals(6, r1);
        assertEquals(1, r2);
        assertEquals(23, r3);
    }
}