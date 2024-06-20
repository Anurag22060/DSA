package LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        Node4 head = new Node4(1);
        Node4 n2 = new Node4(2);
        Node4 n3 = new Node4(3);
        Node4 n4 = new Node4(4);
        Node4 n5 = new Node4(5);

        head.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;

        printLinkedList(head);
//       Node4 newHead = reverseLinkedList(head);
        Node4 newHead = reverseLLRecursively(head);
        printLinkedList(newHead);

    }

//    Method 1
    static Node4 reverseLinkedList(Node4 head){
        if(head == null || head.next == null) return head;
        Node4 prev = head;
        Node4 cur = head.next;
        head.next = null;
        
        while(cur != null){
            Node4 next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

//    Method 2 :- Using Recursion

    static Node4 reverseLLRecursively(Node4 head){
        if(head == null ||head.next == null) return head;

        Node4 headOfSubProblem = reverseLLRecursively(head.next);

        head.next.next = head ;
        head.next = null;

        return headOfSubProblem;


    }
    public static void printLinkedList(Node4 head){
        Node4 temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node4 {
    int data;
    Node4 next;

    public Node4(int data){
        this.data = data;
    }
}
