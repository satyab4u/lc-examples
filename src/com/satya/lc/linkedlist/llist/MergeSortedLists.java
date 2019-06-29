package com.satya.lc.linkedlist.llist;

/**
 * Created by Satya on 3/27/19.
 */
public class MergeSortedLists {

    public static void main(String args[]) {
        ListNode[]  lists = new ListNode[3];
        ListNode l1 = new ListNode(1);
        l1.appendToTail(4);
        l1.appendToTail(5);

        ListNode l2 = new ListNode(1);
        l2.appendToTail(3);
        l2.appendToTail(4);

        ListNode l3 = new ListNode(2);
        l3.appendToTail(6);
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;
        ListNode result = mergeKLists(lists);
        System.out.println(result.printForward());

    }

    public static ListNode mergeKLists(ListNode[] lists) {
       ListNode dummy = new ListNode(0);
       ListNode current = dummy;

       boolean isEmpty = false;
       while(!isEmpty) {

           int minVal = Integer.MAX_VALUE;
           int minIndex = -1;

           for(int i =0 ;i<lists.length;i++) {
               ListNode node = lists[i];
               if(node != null && node.data < minVal) {
                   minVal = node.data;
                   minIndex = i;
               }
           }
           if(minIndex != -1) {
               ListNode node = new ListNode(minVal);
               current.next = node;
               current = node;

               ListNode listNode = lists[minIndex];
               if(listNode.next != null) {
                   lists[minIndex] = listNode.next;
               } else {
                   lists[minIndex] = null;
               }
           } else {
               isEmpty = true;
           }

       }
       return dummy.next;
    }
}
