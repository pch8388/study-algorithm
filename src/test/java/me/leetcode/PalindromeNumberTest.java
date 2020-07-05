package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    @Test
    public void solve() {
        PalindromeNumber p = new PalindromeNumber();
        final boolean r1 = p.isPalindrome(121);
        final boolean r2 = p.isPalindrome(-121);
        final boolean r3 = p.isPalindrome(10);

        assertThat(r1).isTrue();
        assertThat(r2).isFalse();
        assertThat(r3).isFalse();
    }
}