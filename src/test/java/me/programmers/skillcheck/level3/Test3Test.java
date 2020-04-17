package me.programmers.skillcheck.level3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test3Test {

    @Test
    void solve() {
        Test3 t = new Test3();

        int r1 = t.solution("ULURRDLLU");
        int r2 = t.solution("LULLLLLLU");

        assertThat(r1).isEqualTo(7);
        assertThat(r2).isEqualTo(7);
    }
}