package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void solve() {
        AddBinary a = new AddBinary();
        String r1 = a.addBinary("11", "1");
        String r2 = a.addBinary("1010", "1011");

        assertAll(
            () -> assertEquals("100", r1),
            () -> assertEquals("10101", r2)
        );
    }

}