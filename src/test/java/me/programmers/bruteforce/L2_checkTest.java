package me.programmers.bruteforce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class L2_checkTest {

    @Test
    void solve() {
        L2_check l = new L2_check();
        String r1 = l.solution("1 2 3 4");
        String r2 = l.solution("-1 -2 -3 -4");
        String r3 = l.solution("-1 -1");

        assertThat(r1).isEqualTo("1 4");
        assertThat(r2).isEqualTo("-4 -1");
        assertThat(r3).isEqualTo("-1 -1");
    }
}