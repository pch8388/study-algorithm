package me.boj.bruteforce.ps_3085;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CandyTest {
    @Test
    void solve() {
        int r1 = Candy.solve(5, new char[][]{{'Y', 'C', 'P', 'Z', 'Y'},
                                                {'C', 'Y', 'Z', 'Z', 'P'},
                                                {'C', 'C', 'P', 'P', 'P'},
                                                {'Y', 'C', 'Y', 'Z', 'C'},
                                                {'C', 'P', 'P', 'Z', 'Z'}});

        int r2 = Candy.solve(4, new char[][]{{'C', 'Y', 'C', 'C'},
                                                {'Z', 'P', 'Y', 'Z'},
                                                {'Y', 'C', 'C', 'P'},
                                                {'Z', 'P', 'Y', 'Z'}});

        int r3 = Candy.solve(4, new char[][]{{'C', 'Y', 'P', 'C'},
                                                {'Z', 'Z', 'Z', 'C'},
                                                {'Y', 'C', 'Y', 'P'},
                                                {'P', 'C', 'P', 'C'}});

        assertThat(r1).isEqualTo(4);
        assertThat(r2).isEqualTo(3);
        assertThat(r3).isEqualTo(3);
    }

}