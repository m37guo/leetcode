package com.hermione.q24;

/**
 * @author vermouth
 * @date 2020/1/11
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        swapList(newHead, head);
        return newHead.next;
    }

    public void swapList(ListNode head, ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        head.next = node.next;
        node.next = node.next.next;
        head.next.next = node;

        head = head.next.next;
        node = head.next;

        swapList(head, node);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            if (next == null) {
                return "" + val;
            }
            return "" + val + " -> " + next.toString();
        }
    }
}
