package me.programmers.bruteforce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class L2_check2Test {

    @Test
    void solve() {
        L2_check2 l = new L2_check2();

        int r1 = l.solution(78);
        int r2 = l.solution(15);

        assertThat(r1).isEqualTo(83);
        assertThat(r2).isEqualTo(23);
    }

}