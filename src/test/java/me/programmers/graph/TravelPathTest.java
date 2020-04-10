package me.programmers.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TravelPathTest {

    @Test
    void solve() {
        TravelPath path = new TravelPath();

        String[] r1 = path.solution(new String[][]{
            {"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}
        });

        String[] r2 = path.solution(new String[][]{
            {"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}
        });

        String[] r3 = path.solution(new String[][]{
            {"ICN", "BOO"}, {"ICN", "COO"}, {"COO", "DOO"}, {"DOO", "COO"}, {"BOO", "DOO"} ,{"DOO", "BOO"}, {"BOO", "ICN"}, {"COO", "BOO"}
        });



        assertThat(r1).containsExactly("ICN", "JFK", "HND", "IAD");
        assertThat(r2).containsExactly("ICN", "ATL", "ICN", "SFO", "ATL", "SFO");
        assertThat(r3).containsExactly("ICN", "BOO", "DOO", "BOO", "ICN", "COO", "DOO", "COO", "BOO");
    }
}