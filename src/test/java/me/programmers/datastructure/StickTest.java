package me.programmers.datastructure;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StickTest {

    @Test
    void solve() {
        Stick s = new Stick();
        int solution = s.solution("()(((()())(())()))(())");

        assertThat(solution).isEqualTo(17);
    }
}