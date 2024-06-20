package LinkedList;

import java.util.List;

public class ReverseKLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        l1.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;
        printLinkedList(l1);
        int k = 3;
        ListNode reverseKGroups = reverseKGroups(l1,k);
        printLinkedList(reverseKGroups);
    }
    public static void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    static  ListNode reverseKGroups(ListNode head,int k){
        ListNode dummy = new ListNode(-1);
        dummy.next =head;

        ListNode prevTail = dummy;
        ListNode curHead = head;

        while(curHead != null){
            ListNode curTail = findTailAfterK(curHead,k);
            if(curTail == null) break;
            ListNode nextHead = curTail.next;
            reverseKTimes(curHead,k);
            prevTail.next = curTail;
            prevTail = curHead;
            curHead = nextHead;

        }
        prevTail.next = curHead;
        return dummy.next;
    }


    static ListNode findTailAfterK(ListNode head, int k){
        for (int i = 0; i < k-1; i++) {
            head = head.next;
            if(head == null) return null;
        }
        return head;
    }
    static ListNode reverseKTimes(ListNode head, int k){
        if(head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode prev= null;

        int count = 0;
        while(count < k && cur !=null ){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;

        }
        return prev;
    }

}
