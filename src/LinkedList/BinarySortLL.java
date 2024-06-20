package LinkedList;

public class BinarySortLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(0);

        head.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;
        printLinkedList(head);
      int count = getCount(head);
        System.out.println(count);

        int zCount = getCountZ(head);
        System.out.println(zCount);

    }
//    public ListNode sortBinaryList(ListNode A) {
//
//
//        int zeroCount = getCount(A);
//
//
//
//    }

    public static int getCountZ(ListNode head){
        ListNode temp = head;
        int zcount = 0;

        while (temp != null){
            if(temp.val == 0){
                zcount++;
            }
            temp = temp.next;
        }
        return zcount;
    }
    public static int getCount(ListNode head){
        ListNode temp = head;
        int count = 0;

        while (temp != null){
                count++;
            temp = temp.next;
        }
        return count;
    }
    public static void printLinkedList(ListNode head){
        ListNode temp = head ;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
