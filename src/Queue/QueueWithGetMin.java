package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithGetMin {
    public static void main(String[] args) {
        QueueWithGetMin q = new QueueWithGetMin();

        q.enqueue(5);
        q.enqueue(2);
        System.out.println(getMin());
//        System.out.println(getMax());
        dequeue();
        q.enqueue(1);
        enqueue(4);
        enqueue(3);
        System.out.println(getMin());
//        System.out.println(getMax());
        dequeue();
        dequeue();
        System.out.println(getMin());
//        System.out.println(getMax());

    }

    static Queue<Integer> q = new LinkedList<>();
    static ArrayDeque<Integer> dq = new ArrayDeque<>();

    public static void enqueue(int data){
        q.offer(data);
        while(!dq.isEmpty() && dq.getLast() > data){ // (dq.getLast() < data) for getMax()
            dq.pollLast();
        }
        dq.offerLast(data);
    }

    public static int dequeue(){
        if(q.isEmpty()) return -1;
        int temp = q.poll();
        if(temp == dq.getFirst()){
            dq.pollFirst();
        }
        return temp;
    }

    public static int getMin(){
        return dq.getFirst();
    }

//    Max
//    public static int getMax(){
//        return dq.getFirst();
//    }

}
