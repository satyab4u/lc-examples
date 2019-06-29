package com.satya.lc.linkedlist.llist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Satya on 3/20/19.
 */
public class TestLinkedList {
    public static void main(String args[]) {
        ListNode first = new ListNode(1);
        first.appendToTail(2);
        first.appendToTail(3);
        first.appendToTail(2);
        first.appendToTail(3);
        System.out.println(first.printForward());
        removeDuplicates(first);
        System.out.println("After deleting "+first.printForward());
    }

    public static void removeDuplicates(ListNode head) {
        Set<Integer> duplicates = new HashSet<>();
        ListNode current = head;
        ListNode previous = null;
        while(current != null) {
            if(duplicates.contains(current.data)) {
                previous.next = current.next;
            } else {
                duplicates.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
}
