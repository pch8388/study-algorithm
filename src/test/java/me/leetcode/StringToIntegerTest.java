package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerTest {

    @Test
    public void test() {
        StringToInteger s = new StringToInteger();
        final int r1 = s.myAtoi("42");
        final int r2 = s.myAtoi(" -42");
        final int r3 = s.myAtoi("4193 with words");
        final int r4 = s.myAtoi("words and 987");
        final int r5 = s.myAtoi("-91283472332");
        final int r6 = s.myAtoi("+1");
        final int r7 = s.myAtoi("+-2");
        final int r8 = s.myAtoi("9223372036854775808");
        final int r9 = s.myAtoi("  0000000000012345678");
        final int r10 = s.myAtoi("0-1");
        final int r11 = s.myAtoi("-5-");
        final int r12 = s.myAtoi("123-");

        assertThat(r1).isEqualTo(42);
        assertThat(r2).isEqualTo(-42);
        assertThat(r3).isEqualTo(4193);
        assertThat(r4).isEqualTo(0);
        assertThat(r5).isEqualTo(-2147483648);
        assertThat(r6).isEqualTo(1);
        assertThat(r7).isEqualTo(0);
        assertThat(r8).isEqualTo(Integer.MAX_VALUE);
        assertThat(r9).isEqualTo(12345678);
        assertThat(r10).isEqualTo(0);
        assertThat(r11).isEqualTo(-5);
        assertThat(r12).isEqualTo(123);
    }
}