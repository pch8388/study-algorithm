package me.programmers.skillcheck.level3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Test5Test {

    @Test
    public void solve() {
        Test5 t = new Test5();

        final String r1 = t.solution(1, 1, 5, new String[]{"08:00", "08:01", "08:02", "08:03"});
        final String r2 = t.solution(2, 10, 2, new String[]{"09:10", "09:09", "08:00"});
        final String r3 = t.solution(2, 1, 2, new String[]{"09:00", "09:00", "09:00", "09:00"});
        final String r4 = t.solution(1, 1, 5, new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"});
        final String r5 = t.solution(1, 1, 1, new String[]{"23:59"});
        final String r6 = t.solution(10, 60, 45, new String[]{"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59",
            "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"});


        assertThat(r1).isEqualTo("09:00");
        assertThat(r2).isEqualTo("09:09");
        assertThat(r3).isEqualTo("08:59");
        assertThat(r4).isEqualTo("00:00");
        assertThat(r5).isEqualTo("09:00");
        assertThat(r6).isEqualTo("18:00");
    }

    @Test
    public void sort() {
        final String[] strings = {"09:10", "09:09", "08:00"};

        Arrays.sort(strings);
        assertThat(strings).containsExactly("08:00", "09:09", "09:10");
    }
}