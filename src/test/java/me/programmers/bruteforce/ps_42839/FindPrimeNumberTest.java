package me.programmers.bruteforce.ps_42839;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberTest {

    @Test
    void solve() {
        FindPrimeNumber f = new FindPrimeNumber();
        final int r1 = f.solution("17");
        final int r2 = f.solution("011");

        assertEquals(3, r1);
        assertEquals(2, r2);
    }
}