package Queue;

import java.util.ArrayDeque;

public class ImplementQueueUsingTwoStack {
    public static void main(String[] args) {
        ImplementQueueUsingTwoStack q = new ImplementQueueUsingTwoStack();
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
   private  ArrayDeque<Integer> stack1 = new ArrayDeque<>();
   private ArrayDeque<Integer> stack2 = new ArrayDeque<>();

   public void enqueue(int data){
       stack1.push(data);
   }
   public int dequeue(){
       if(stack1.isEmpty() && stack2.isEmpty()){
           return -1;
       }
       if(!stack2.isEmpty()){
           return stack2.pop();
       }
       while(!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }
       return  stack2.pop();
   }




}


// OR Solution

//import java.util.Stack;
//
//class MyQueue {
//    Stack<Integer> s1 = new Stack<Integer>();
//    Stack<Integer> s2 = new Stack<Integer>();
//
//    //Function to push an element in queue by using 2 stacks.
//    void Push(int x) {
//        s1.push(x);
//    }
//
//    //Function to pop an element from queue by using 2 stacks.
//    int Pop() {
//        while (!s1.isEmpty()) {
//            s2.push(s1.peek());
//            s1.pop();
//        }
//
//        int ans = -1;
//        if (!s2.isEmpty()) {
//            ans = s2.peek();
//            s2.pop();
//        }
//        while (!s2.isEmpty()) {
//            s1.push(s2.peek());
//            s2.pop();
//        }
//        return ans;
//    }
//}

