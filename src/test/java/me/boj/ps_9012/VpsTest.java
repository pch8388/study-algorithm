package me.boj.ps_9012;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VpsTest {

    @Test
    void validPS() {
        assertThat(Vps.valid("(())())")).isEqualTo("NO");
        assertThat(Vps.valid("(((()())()")).isEqualTo("NO");
        assertThat(Vps.valid("(()())((()))")).isEqualTo("YES");
        assertThat(Vps.valid("((()()(()))(((())))()")).isEqualTo("NO");
        assertThat(Vps.valid("()()()()(()()())()")).isEqualTo("YES");
        assertThat(Vps.valid("(()((())()(")).isEqualTo("NO");
    }
}