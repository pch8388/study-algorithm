package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwapNodesInParesTest {

    @Test
    void solve() {
        SwapNodesInPares s = new SwapNodesInPares();
        SwapNodesInPares.ListNode result = s.swapPairs(
                new SwapNodesInPares.ListNode(1,
                        new SwapNodesInPares.ListNode(2,
                                new SwapNodesInPares.ListNode(3,
                                        new SwapNodesInPares.ListNode(4)))));

        assertThat(result.val).isEqualTo(2);
    }

}