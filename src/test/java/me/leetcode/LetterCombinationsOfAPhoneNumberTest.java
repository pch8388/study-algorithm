package me.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCombinationsOfAPhoneNumberTest {

    @Test
    void solve() {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();
        final List<String> r1 = l.letterCombinations("23");
        final List<String> r2 = l.letterCombinations("");
        final List<String> r3 = l.letterCombinations("2");

        assertThat(r1).contains("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertThat(r2.size()).isEqualTo(0);
        assertThat(r3).contains("a", "b", "c");
    }
}