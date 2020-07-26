package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerToRomanTest {

    @Test
    public void solve() {
        IntegerToRoman i = new IntegerToRoman();
        final String r1 = i.intToRoman(3);
        final String r2 = i.intToRoman(4);
        final String r3 = i.intToRoman(9);
        final String r4 = i.intToRoman(58);
        final String r5 = i.intToRoman(1994);

        assertThat(r1).isEqualTo("III");
        assertThat(r2).isEqualTo("IV");
        assertThat(r3).isEqualTo("IX");
        assertThat(r4).isEqualTo("LVIII");
        assertThat(r5).isEqualTo("MCMXCIV");
    }
}