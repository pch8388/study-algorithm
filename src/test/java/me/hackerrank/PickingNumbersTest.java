package me.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class PickingNumbersTest {

    @Test
    public void solve() {
        final int r1 = PickingNumbers.pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1));
        final int r2 = PickingNumbers.pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2));

        assertThat(r1).isEqualTo(3);
        assertThat(r2).isEqualTo(5);
    }

}