package LinkedList;

public class RemoveNthNodeFromListEnd {

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
        ListNode remove = removeNthFromEnd(head,4);
        printLinkedList(remove);
    }



        public static ListNode removeNthFromEnd(ListNode A, int B) {
            //You can code here
            int size = getCount(A);
            if (B >=size) {
                return A.next;
            } else{

                ListNode pre = reverseLL(A);
                ListNode del = deleteN(pre,B);
                ListNode curL = reverseLL(del);
                return curL;
            }


        }
        static ListNode deleteN(ListNode head,int B){
            if(head == null) return head ;
            ListNode temp = head;
            if (B == 1) {
                head = temp.next;
                return head;
            }


            for(int i=0;temp != null && i < B-2;i++){ // Main Solution Line
                temp = temp.next;
            }
            if (temp == null || temp.next == null) return head;
            ListNode next = temp.next.next;
            temp.next = next;

            return head;
        }
        static ListNode reverseLL(ListNode head){

            if(head== null || head.next == null) return head;
            ListNode prev = head;
            ListNode cur = head.next;
            head.next = null;

            while(cur != null){
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur=next;
            }
            return prev;
        }
        public static int getCount(ListNode head) {
            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    public static void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { val = 0; next = null; }
        ListNode(int val) { this.val = val; next = null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
