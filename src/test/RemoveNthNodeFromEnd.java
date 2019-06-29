package test;

/**
 * Created by Satya on 6/28/19.
 */
public class RemoveNthNodeFromEnd {

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        for(int i =2; i<=5; i++) {
            head.appendToTail(i);
        }
        System.out.println(head.printForward());
        ListNode node =removeNthNode(head, 2);
        System.out.println(node.printForward());
    }

    public static ListNode removeNthNode(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preDelete = dummy;
        for(int i=0; i<n; i++) {
            if(head == null) {
                return null;
            }
            head = head.next;
        }

        while(head != null) {
            preDelete.next = head.next;
            head = head.next;
        }
        preDelete.next = preDelete.next.next;

        return dummy.next;
    }
}
