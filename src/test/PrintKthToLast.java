package test;

import java.util.List;

/**
 * Created by Satya on 6/28/19.
 */
public class PrintKthToLast {
    public static void main(String args[]) {
        ListNode head = new ListNode(0);
        for(int i = 1; i < 1; i++) {
            head.appendToTail(i);
        }
        System.out.println(head.printForward());
      //  deleteNode(head.next.next.next);
       // System.out.println("data:"+deleteMiddleNode(head));

        ListNode last = reverseLinkedList(head);
        System.out.println(last.printForward());
        System.out.println("Is Palindrome:"+isPalindrome(head,last));
        /*System.out.println(head.printForward());
        for (int i = 0; i < 7; i++) {
            ListNode kthNode = printKthToLast(head, i);
            if(kthNode != null)
                System.out.println(i +" : kth node from last"+kthNode.data);
        }*/

    }

    public static ListNode printKthToLast(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;

        for(int i =0; i<k ; i++) {
            if(p1 == null) return null;
            p1 = p1.next;
        }

        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;

    }

    public static int printKthToLast1(ListNode head, int k) {
        if (head == null) {
            return 0;
        }
        int index = printKthToLast1(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }

    public static int deleteMiddleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        while(current != null) {
            current  = current.next;
            count++;
        }
        ListNode p1 = head;
        for(int i = 0;i < count/2  ; i++) {
            p1 = p1.next;
        }
        int data = p1.next.data;
        p1.next = p1.next.next;
        return data;
    }

    public static boolean deleteNode(ListNode node) {
        if(node == null || node.next == null) return false;
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null;

        while(head != null) {
            ListNode node = new ListNode(head.data);
            node.next = previous;
            previous = node;
            head = head.next;
        }
        return previous;
    }

    public static boolean isPalindrome(ListNode p1,ListNode p2) {
        while(p1 != null && p2 != null) {
            if(p1.data != p2.data) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1 == null && p2 == null;
    }



}
