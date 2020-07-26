package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    @Test
    public void solve() {
        RomanToInteger roman = new RomanToInteger();
        final int r1 = roman.romanToInt("III");
        final int r2 = roman.romanToInt("IV");
        final int r3 = roman.romanToInt("IX");
        final int r4 = roman.romanToInt("LVIII");
        final int r5 = roman.romanToInt("MCMXCIV");

        assertThat(r1).isEqualTo(3);
        assertThat(r2).isEqualTo(4);
        assertThat(r3).isEqualTo(9);
        assertThat(r4).isEqualTo(58);
        assertThat(r5).isEqualTo(1994);
    }
}