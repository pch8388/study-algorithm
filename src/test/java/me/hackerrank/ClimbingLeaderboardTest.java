package me.hackerrank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingLeaderboardTest {

    @Test
    public void solve() {
        final int[] results1 = ClimbingLeaderboard.climbingLeaderboard(
            new int[]{100, 90, 90, 80, 75, 60}, new int[]{50, 65, 77, 90, 102});

        final int[] results2 = ClimbingLeaderboard.climbingLeaderboard(
            new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});

        assertThat(results1).containsExactly(6, 5, 4, 2, 1);
        assertThat(results2).containsExactly(6, 4, 2, 1);
    }
}