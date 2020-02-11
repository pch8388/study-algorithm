package me.boj.dp.ps_9251;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LcsTest {

    @Test
    void solve() {
        int r1 = Lcs.solve("ACAYKP", "CAPCAK");
        int r2 = Lcs.solve("A", "B");
        int r3 = Lcs.solve("ABAB", "AAB");
        int r4 = Lcs.solve("bcdefgha", "acdefghb");
        int r5 = Lcs.solve("ABCD", "DBCA");
        int r6 = Lcs.solve("SKDFHWEODJKSFSDFJK", "WKJSDHFOWEFKJDVKSDF");

        assertThat(r1).isEqualTo(4);
        assertThat(r2).isEqualTo(0);
        assertThat(r3).isEqualTo(3);
        assertThat(r4).isEqualTo(6);
        assertThat(r5).isEqualTo(2);
        assertThat(r6).isEqualTo(10);
    }
}