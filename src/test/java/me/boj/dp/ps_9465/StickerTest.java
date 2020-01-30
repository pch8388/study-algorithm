package me.boj.dp.ps_9465;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StickerTest {

    @Test
    void solve() {
        int r1 = Sticker.solve(5, new int[][]{{50, 30}, {10, 50}, {100, 70}, {20, 10}, {40, 60}});
        int r2 = Sticker.solve(7, new int[][]{{10, 20}, {30, 40}, {10, 30}, {50, 50}, {100, 60}, {20, 20}, {40, 80}});

        assertThat(r1).isEqualTo(260);
        assertThat(r2).isEqualTo(290);
    }

}