package LinkedList;

public class ReverseLL2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        l1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        printLinkedList(l1);
        reverseBetween(l1,2,4);
        printLinkedList(l1);
    }
    public static void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


        public static ListNode reverseBetween(ListNode head, int m, int n) {
            if (head == null || m == n) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;

            // Move prev to the (m-1)th node
            for (int i = 0; i < m - 1; i++) {
                prev = prev.next;
            }

            ListNode current = prev.next;
            ListNode next = null;
            ListNode prevM = prev; // Previous of M
            ListNode nodeM = current; // Node at M

            // Reverse the nodes from M to N
            for (int i = m; i <= n; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            prevM.next = prev;
            nodeM.next = current;

            return dummy.next;
        }
    }



