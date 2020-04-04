package me.boj.bruteforce.ps_10448;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EurekaTest {

    @Test
    void solve() {
        int r1 = Eureka.solve(10);
        int r2 = Eureka.solve(20);
        int r3 = Eureka.solve(1000);

        assertThat(r1).isEqualTo(1);
        assertThat(r2).isEqualTo(0);
        assertThat(r3).isEqualTo(1);
    }
}