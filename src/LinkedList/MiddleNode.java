package LinkedList;

public class MiddleNode {
    public static void main(String[] args) {
        Node1 head = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);
        Node1 n5 = new Node1(5);

        head.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;

        Node1 middle = findMiddle(head);
        System.out.println(middle.data);

    }

    static Node1 findMiddle(Node1 head){
        Node1 slow = head;
        Node1 fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}

class Node1 {
    int data;
    Node1 next;

    public Node1(int data){
        this.data = data;
    }
}