package me.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateParenthesesTest {

    @Test
    void solve() {
        GenerateParentheses g = new GenerateParentheses();
        List<String> r1 = g.generateParenthesis(3);
        List<String> r2 = g.generateParenthesis(1);

        assertThat(r1).containsExactlyInAnyOrder("((()))","(()())","(())()","()(())","()()()");
        assertThat(r2).containsExactlyInAnyOrder("()");
    }
}