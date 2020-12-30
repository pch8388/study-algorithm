package me.programmers.etc.ps_42577;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void solve() {
        final PhoneBook p = new PhoneBook();
        final boolean r1 = p.solution(new String[]{"119", "97674223", "1195524421"});
        final boolean r2 = p.solution(new String[]{"123", "456", "789"});
        final boolean r3 = p.solution(new String[]{"12", "123", "1235", "567", "88"});
        final boolean r4 = p.solution(new String[]{"00100", "001"});

        assertFalse(r1);
        assertTrue(r2);
        assertFalse(r3);
        assertFalse(r4);
    }

    @Test
    void string_sort() {
        String[] target = new String[]{"001", "12", "345", "9"};

        assertArrayEquals(new String[]{"001", "12", "345", "9"}, target);
    }

}