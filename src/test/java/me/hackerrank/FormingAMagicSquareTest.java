package me.hackerrank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FormingAMagicSquareTest {

    @Test
    public void solve() {
        final int r1 = FormingAMagicSquare.formingMagicSquare(
            new int[][]{{5, 3, 4},
                        {1, 5, 8},
                        {6, 4, 2}});

        final int r2 = FormingAMagicSquare.formingMagicSquare(
            new int[][]{{4, 9, 2},
                        {3, 5, 7},
                        {8, 1, 5}});

        final int r3 = FormingAMagicSquare.formingMagicSquare(
            new int[][]{{4, 8, 2},
                        {4, 5, 7},
                        {6, 1, 6}});

        assertThat(r1).isEqualTo(7);
        assertThat(r2).isEqualTo(1);
        assertThat(r3).isEqualTo(4);
    }
}