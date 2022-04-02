package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void solve() {
        RemoveElement r = new RemoveElement();
        int r1 = r.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);

        assertEquals(5, r1);
    }

}