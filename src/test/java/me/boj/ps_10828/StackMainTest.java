package me.boj.ps_10828;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackMainTest {

    @Test
    void push() {
        Stack stack = Stack.of(2);
        assertThat(stack.push(1)).contains(1);
        assertThat(stack.push(2)).containsExactly(1, 2);
    }

    @Test
    void pop() {
        Stack stack = Stack.of(1);
        stack.push(1);
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(-1);
    }

    @Test
    void size() {
        Stack stack = Stack.of(3);
        stack.push(1);
        stack.push(2);
        assertThat(stack.size()).isEqualTo(2);
    }

    @Test
    void top() {
        Stack stack = Stack.of(3);
        stack.push(1);
        assertThat(stack.top()).isEqualTo(1);

        stack.pop();
        assertThat(stack.top()).isEqualTo(-1);
    }
}