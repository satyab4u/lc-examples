package com.satya.lc.linkedlist;

/**
 * Created by Satya on 3/7/19.
 */
public class AdditionInLL {
    public static void main(String args[]) {
        ListNode l1 = new ListNode(3);
        ListNode current = l1;
        ListNode node2 = new ListNode(4);
        current.next = node2;
        current = node2;
        ListNode node3 = new ListNode(1);
        current.next = node3;
        ListNode result = Solution.addTwoNumbers(l1, l1);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry = 0;
            ListNode dummy = new ListNode(0);
            ListNode head = dummy;

            while(l1 != null && l2 != null) {
                int sum = l1.val + l2.val + carry;
                carry = sum/10;
                sum = sum % 10;
                ListNode node = new ListNode(sum);
                dummy.next = node;
                dummy = node;
                l1 = l1.next;
                l2 = l2.next;
            }

            while(l1 != null) {
                int sum = l1.val + carry;
                carry = sum/10;
                sum = sum % 10;
                ListNode node = new ListNode(sum);
                dummy.next = node;
                dummy = node;
                l1 = l1.next;
            }
            while(l2 != null) {
                int sum = l2.val + carry;
                carry = sum/10;
                sum = sum % 10;
                ListNode node = new ListNode(sum);
                dummy.next = node;
                dummy = node;
                l2 = l2.next;
            }
            if(carry != 0) {
                ListNode node = new ListNode(carry);
                dummy.next = node;
            }

            return head.next;
        }
    }
}
