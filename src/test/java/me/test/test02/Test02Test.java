package me.test.test02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test02Test {

    @Test
    public void solve() {
        Test02 t = new Test02();
        final int solution = t.solution(new int[]{1, 2, -3, 4, 5, -6});
        final int solution2 = t.solution(new int[]{-1, -2, 1});
        final int solution3 = t.solution(new int[]{-1, -2});
        final int solution4 = t.solution(new int[]{-1, 0});
        final int solution5 = t.solution(new int[]{0, 1});
        final int solution6 = t.solution(new int[]{1, 2, -3, 4, 5});
        final int solution7 = t.solution(new int[]{1, 2, 4, 5});
        final int solution8 = t.solution(new int[]{});
        final int solution9 = t.solution(new int[]{1000, 1000, 1000, 1000});
        final int solution10 = t.solution(new int[]{1000, 1000, 1000, 1000, 0, -1000, 1000, 1000, 1000, 0, 1000});
        final int solution11 = t.solution(new int[]{-8, 3, 0, 5, -3, 12});
        final int solution12 = t.solution(new int[]{-1, 2, 1, 2, 0, 2, 1, -3, 4, 3, 0, -1});
        final int solution13 = t.solution(new int[]{10});
        final int solution14 = t.solution(new int[]{1, 1});

        assertThat(solution).isEqualTo(9);
        assertThat(solution2).isEqualTo(1);
        assertThat(solution3).isEqualTo(-1);
        assertThat(solution4).isEqualTo(0);
        assertThat(solution5).isEqualTo(1);
        assertThat(solution6).isEqualTo(9);
        assertThat(solution7).isEqualTo(12);
        assertThat(solution8).isEqualTo(-1);
        assertThat(solution9).isEqualTo(4000);
        assertThat(solution10).isEqualTo(4000);
        assertThat(solution11).isEqualTo(12);
        assertThat(solution12).isEqualTo(8);
        assertThat(solution13).isEqualTo(10);
        assertThat(solution14).isEqualTo(2);
    }
}