package me.test.test04;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test04Test {

    @Test
    public void solve() {
        Test04 t = new Test04();

        final int r1 = t.solution("aaaabbbb");
        final int r2 = t.solution("ccaaffddecee");
        final int r3 = t.solution("eeee");
        final int r4 = t.solution("example");

        assertThat(r1).isEqualTo(1);
        assertThat(r2).isEqualTo(6);
        assertThat(r3).isEqualTo(0);
        assertThat(r4).isEqualTo(4);
    }

    @Test
    public void test() {
        char a = 'a';
        int x = a - 97;
        int y = 'b' - 97;
        int z = 'z' - 97;

        assertThat(x).isEqualTo(0);
        assertThat(y).isEqualTo(1);
        assertThat(z).isEqualTo(25);
    }
}