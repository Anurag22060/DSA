package LinkedList;

import jdk.internal.util.xml.impl.Input;

public class DeleteMiddleNode {
        public static void main(String[] args) {
            Node3 head = new Node3(1);
            Node3 n2 = new Node3(2);
            Node3 n3 = new Node3(3);
            Node3 n4 = new Node3(4);
            Node3 n5 = new Node3(5);

            head.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;

            printLinkedList(head);
            head = findMiddle(head);
            printLinkedList(head);
        }

        static Node3 findMiddle(Node3 head) {
            Node3 slow = head;
            Node3 fast = head;
            Node3 prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

          if(prev != null){
              prev.next = slow.next;
          }
            return head;

        }
    public static void printLinkedList(Node3 head){
        Node3 temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    }


class Node3 {

    int data;
    Node3 next;

    public Node3(int data){
        this.data = data;
    }
}