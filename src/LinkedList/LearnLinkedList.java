package LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
//        Creating Nodes
        ListNode1<Integer> head = new ListNode1<>(1);
        ListNode1<Integer> n1 = new ListNode1<>(2);
        ListNode1<Integer> n2 = new ListNode1<>(3);
        ListNode1<Integer> n3 = new ListNode1<>(4);

//        Linking Nodes
        head.next = n1;
        n1.next = n2;
        n2.next = n3;

//        for Doubly LinkedList add previous pointer

        n1.prev = head;
        n2.prev = n1;
        n3.prev = n2;
//


        printLinkedList(head);
        head = deleteFromLinkedList(2,head);
//        head= insertInLinkedList(0,8,head);
        printLinkedList(head);
    }


    public static ListNode1<Integer> deleteFromLinkedList(int pos, ListNode1<Integer> head){
        if(pos==0){
            return head.next;
        }

        ListNode1<Integer> temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp =temp.next;
        }
        temp.next = temp.next.next;
//        for Doubly LinkedList add previous pointer
        temp.next.next.prev = temp;
//
        return head;



    }
    public static void printLinkedList(ListNode1<Integer> head){
        ListNode1<Integer> temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode1<Integer> insertInLinkedList(int pos, int data, ListNode1<Integer> head){
        ListNode1<Integer> newNode = new ListNode1<>(data);

        if(pos==0){
            newNode.next = head;
//            for Doubly LinkedList add previous pointer
            head.prev = newNode;
//
            return newNode;
        }

        ListNode1<Integer> temp = head;

        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
//        for Doubly LinkedList add previous pointer
        temp.next.prev = newNode;
//
        temp.next = newNode;
//        for Doubly LinkedList add previous pointer
        newNode.prev = temp;
//
        return head;




    }
}

//Initiallizing the class Node
class ListNode1<E>{
        E val;
        ListNode1<E> next;
//        for Doubly LinkedList add previous pointer
        ListNode1<E> prev;
//
        public ListNode1(E val) {
            this.val = val;
            this.next = null;

//            for Doubly LinkedList initialize previous pointer
            this.prev = null;
//
        }
    }

