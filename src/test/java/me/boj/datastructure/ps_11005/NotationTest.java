package me.boj.datastructure.ps_11005;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NotationTest {
    @Test
    void notation() {
        String result = Notation.notation(60466175, 36);
        assertThat(result).isEqualTo("ZZZZZ");
        assertThat(Notation.notation(101, 10)).isEqualTo("101");
    }

    @Test
    void test() {
        int a = 10;
        int b = 11;
        int c = 12;
        char aa = (char) (a + 55);
        char bb = (char) (b + 55);
        char cc = (char) (c + 55);


        assertThat(aa).isEqualTo('A');
        assertThat(bb).isEqualTo('B');
        assertThat(cc).isEqualTo('C');
    }

}