package LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        Node5 head = new Node5(1);
        Node5 n2 = new Node5(2);
        Node5 n3 = new Node5(3);
        Node5 n4 = new Node5(2);
        Node5 n5 = new Node5(1);

        head.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;

        System.out.println(isLLPalindrome(head));

    }

    static boolean isLLPalindrome(Node5 head){
        Node5 middle = findMiddle(head);
        Node5 t2 = reverseLinkedList(middle);
        Node5 t1 = head;

        while(t2!= null){
            if(t1.data != t2.data){
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
    static Node5 findMiddle(Node5 head){
        Node5 slow = head;
        Node5 fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node5 reverseLinkedList(Node5 head){
        if(head == null || head.next == null) return head;
        Node5 prev = head;
        Node5 cur = head.next;
        head.next = null;

        while(cur != null){
            Node5 next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

class Node5 {
    int data;
    Node5 next;

    public Node5(int data){
        this.data = data;
    }
}
