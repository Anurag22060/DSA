package Queue;

import java.util.ArrayDeque;

public class ImplementQueueUsingOneStack {


    public static void main(String[] args) {
        ImplementQueueUsingOneStack q = new ImplementQueueUsingOneStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

    ArrayDeque<Integer> stack = new ArrayDeque<>();

    public void enqueue(int data){
        stack.push(data);
    }
    public int dequeue(){
        if(stack.isEmpty()) return -1;

        if(stack.size() == 1){
            return stack.pop();
        }

        int top = stack.pop();
        int ans = dequeue();
        stack.push(top);

        return ans;
    }



}
