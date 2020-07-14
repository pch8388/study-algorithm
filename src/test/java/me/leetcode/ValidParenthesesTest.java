package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    @Test
    public void solve() {
        ValidParentheses v = new ValidParentheses();
        boolean r1 = v.isValid("()");
        boolean r2 = v.isValid("()[]{}");
        boolean r3 = v.isValid("(]");
        boolean r4 = v.isValid("([)]");
        boolean r5 = v.isValid("{[]}");

        assertThat(r1).isTrue();
        assertThat(r2).isTrue();
        assertThat(r3).isFalse();
        assertThat(r4).isFalse();
        assertThat(r5).isTrue();
    }
}