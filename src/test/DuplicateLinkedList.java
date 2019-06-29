package test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Satya on 6/25/19.
 */
public class DuplicateLinkedList {

    public static void main(String args[]) {
       ListNode l1 = new ListNode(1);
       l1.appendToTail(2);
       l1.appendToTail(2);
       l1.appendToTail(3);
       l1.appendToTail(3);
       l1.appendToTail(4);
       System.out.println(l1.printForward());
       removeDuplicates(l1);
       System.out.println(l1.printForward());
    }

    public static void removeDuplicates(ListNode head) {
        ListNode current = head;
        Set<Integer> integerSet = new HashSet<>();
        ListNode previous = null;
        while(current != null) {
            if(integerSet.contains(current.data)) {
                previous.next = current.next;
            } else {
                integerSet.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
}
