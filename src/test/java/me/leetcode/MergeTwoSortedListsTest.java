package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    @Test
    public void test() {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode result = m.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(3, new ListNode(4))));

        assertThat(result).extracting("val")
            .containsExactly(1);

        assertThat(result.next).extracting("val")
            .containsExactly(1);

        assertThat(result.next.next).extracting("val")
            .containsExactly(2);

        assertThat(result.next.next.next).extracting("val")
            .containsExactly(3);

        assertThat(result.next.next.next.next).extracting("val")
            .containsExactly(4);

        assertThat(result.next.next.next.next.next).extracting("val")
            .containsExactly(4);
    }
}