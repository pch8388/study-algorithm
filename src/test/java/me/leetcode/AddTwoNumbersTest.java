package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

	@Test
	public void solve() {
		AddTwoNumbers numbers = new AddTwoNumbers();
		final ListNode result = numbers.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
			new ListNode(5, new ListNode(6, new ListNode(4))));

		assertThat(result).extracting("val")
			.containsExactly(7);

		assertThat(result.next).extracting("val")
			.containsExactly(0);

		assertThat(result.next.next).extracting("val")
			.containsExactly(8);


	}
}