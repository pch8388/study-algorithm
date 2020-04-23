package me.programmers.datastructure.ps_42746;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @Test
    void solve() {
        Order order = new Order();
        String r1 = order.solution(new int[]{6, 10, 2});
        String r2 = order.solution(new int[]{3, 30, 34, 5, 9});

        assertThat(r1).isEqualTo("6210");
        assertThat(r2).isEqualTo("9534330");
    }
}