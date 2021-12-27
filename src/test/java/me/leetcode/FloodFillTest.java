package me.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void solution() {
        FloodFill floodFill = new FloodFill();
        final int[][] result = floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        final int[][] result2 = floodFill.floodFill(new int[][]{{0,0,0}, {0,0, 0}}, 0, 0, 2);

        assertTrue(Arrays.deepEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, result));
        assertTrue(Arrays.deepEquals(new int[][]{{2, 2, 2}, {2, 2, 2}}, result2));
    }
}