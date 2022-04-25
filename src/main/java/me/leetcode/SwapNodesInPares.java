package me.leetcode;

public class SwapNodesInPares {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        head = head.next;

        while (cur != null && cur.next != null) {
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
            if (cur != null && cur.next != null) tmp.next = cur.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

