package Queue;

public class MainClassForMyQueue {
    public static void main(String[] args) {
//        MyQueue q = new MyQueue(4);
        MyCircularQueue q = new MyCircularQueue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.printQueue();
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(50);

        q.printQueue();



    }

}
