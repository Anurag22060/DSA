package LinkedList;

public class ReorderLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;
        printLinkedList(head);
        ListNode reOrder = reorderLL(head);
        printLinkedList(reOrder);
    }

    static ListNode reorderLL(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l2 = reverseLinkedList(slow);
        ListNode l1 = head;

        while(l2.next != null){
            if(l1==l2){
                l1.next = null;
                break;
            }

            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;


        }
        return  head;
    }
    static ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public static void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
