package me.codility.lesson1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryGapTest {
    @Test
    public void solve() {
        BinaryGap gap = new BinaryGap();
        final int r1 = gap.solution(9);
        final int r2 = gap.solution(529);
        final int r3 = gap.solution(20);
        final int r4 = gap.solution(15);
        final int r5 = gap.solution(32);
        final int r6 = gap.solution(1041);

        assertThat(r1).isEqualTo(2);
        assertThat(r2).isEqualTo(4);
        assertThat(r3).isEqualTo(1);
        assertThat(r4).isEqualTo(0);
        assertThat(r5).isEqualTo(0);
        assertThat(r6).isEqualTo(5);
    }
}