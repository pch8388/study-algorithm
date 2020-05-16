package me.boj.dp.ps_1904;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TileTest {

    @Test
    void solve() {
        long r1 = Tile.solve(4);

        assertThat(r1).isEqualTo(5);

    }

}