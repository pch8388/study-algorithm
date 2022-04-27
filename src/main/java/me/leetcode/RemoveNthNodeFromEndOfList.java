package me.leetcode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode[] arr = new ListNode[31];
        int index = 1;
        ListNode cur = head;
        arr[index] = cur;
        while (cur.next != null) {
            arr[++index] = cur.next;
            cur = cur.next;
        }

        if (index == 1) return null;
        if (index - n + 1 >= index) {
            arr[index - n].next = null;
            return head;
        }
        if (index - n == 0) {
            return arr[2];
        }

        arr[index - n].next = arr[index - n + 1].next;

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
