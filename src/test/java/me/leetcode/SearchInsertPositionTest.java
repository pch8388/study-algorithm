package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void solve() {
        SearchInsertPosition p = new SearchInsertPosition();
        int r1 = p.searchInsert(new int[]{1, 3, 5, 6}, 5);
        int r2 = p.searchInsert(new int[]{1, 3, 5, 6}, 2);
        int r3 = p.searchInsert(new int[]{1, 3, 5, 6}, 7);

        assertEquals(2, r1);
        assertEquals(1, r2);
        assertEquals(4, r3);
    }
}