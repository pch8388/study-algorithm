package me.programmers.datastructure.ps_42579;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestAlbumTest {

    @Test
    void solve() {
        BestAlbum b = new BestAlbum();

        int[] solution = b.solution(
            new String[]{"classic", "pop", "classic", "classic", "pop"},
            new int[]{500, 600, 150, 800, 2500});

        assertThat(solution).containsExactly(4, 1, 3, 0);
    }
}