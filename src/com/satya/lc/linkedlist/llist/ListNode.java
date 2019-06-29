package com.satya.lc.linkedlist.llist;

/**
 * Created by Satya on 3/20/19.
 */
public class ListNode {

    public int data;

    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public void appendToTail(int d) {
        ListNode end = new ListNode(d);
        ListNode current = this;
        while(current.next != null) {
            current = current.next;
        }
        current.next = end;
    }

    public String printForward() {
        if(next != null) {
            return data+" ->"+next.printForward();
        } else {
            return String.valueOf(data);
        }
    }

}
