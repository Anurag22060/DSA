package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingOneQueue {
    public static void main(String[] args) {
        ImplementStackUsingOneQueue q = new ImplementStackUsingOneQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        q.push(40);
        System.out.println(q.pop());

    }

    Queue<Integer> q = new LinkedList<>();

    public void push(int data){
        q.offer(data);
    }
    public int pop(){
        if(q.isEmpty()) return -1;
        int size = q.size();
        for (int i = 0; i < size-1; i++) {
            q.offer(q.poll());
        }
        return q.poll();


    }
}
