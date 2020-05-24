package me.test.test03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test03Test {

    @Test
    public void solve() {
        Test03 t = new Test03();

        final int r1 = t.solution("We test coders. Give us a try?");
        final int r2 = t.solution("Forget  CVs..Save time . x x");

        assertThat(r1).isEqualTo(4);
        assertThat(r2).isEqualTo(2);
    }
}