package me.leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode t1 = l1;
		ListNode t2 = l2;

		ListNode head = new ListNode();
		ListNode node = head;

		int sum = t1.val + t2.val;
		boolean carry = false;
		if (sum > 9) {
			sum = sum % 10;
			carry = true;
		}
		head.val = sum;
		while (t1.next != null || t2.next != null) {
			int x1 = 0;
			if (t1.next != null) {
				t1 = t1.next;
				x1 = t1.val;
			}
			int y1 = 0;
			if (t2.next != null) {
				t2 = t2.next;
				y1 = t2.val;
			}
			int s = x1 + y1;
			if (carry) {
				s++;
				carry = false;
			}

			if (s > 9) {
				carry = true;
				s %= 10;
			}
			node.next = new ListNode(s);
			node = node.next;
		}

		if (carry) {
			node.next = new ListNode(1);
		}

		return head;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
