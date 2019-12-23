package me.study.algo_2747;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {
    @Test
    void fibonacci() {
        assertThat(Fibonacci.fibonacci(10)).isEqualTo(55);
    }
}