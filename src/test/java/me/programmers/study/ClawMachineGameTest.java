package me.programmers.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClawMachineGameTest {

    @Test
    void solution() {
        ClawMachineGame game = new ClawMachineGame();
        final int solution = game.solution(
            new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
            new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        assertEquals(4, solution);
    }
}