package LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node2 head = new Node2(1);
        Node2 n2 = new Node2(2);
        Node2 n3 = new Node2(2);
        Node2 n4 = new Node2(4);
        Node2 n5 = new Node2(4);

        head.next = n2;
        n2.next= n3;
        n3.next= n4;
        n4.next = n5;

        printLinkedList(head);
        Node2 newHead = removeDuplicateElements(head);
        printLinkedList(newHead);
    }
    static Node2 removeDuplicateElements(Node2 head){
        Node2 orig = head;
        Node2 newHead = null;
        Node2 temp = head;

        while(orig != null){
            while(orig.next != null && orig.data == orig.next.data){
                orig = orig.next;
            }
            if(newHead == null){
                newHead = temp = orig;
            }
            else{
                temp.next = orig;
                temp = orig;
            }
            orig = orig.next;
        }
        return newHead;
    }
    static void printLinkedList(Node2 temp){
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Node2{
int data;
Node2 next;

    public Node2(int data) {
        this.data = data;
    }
}