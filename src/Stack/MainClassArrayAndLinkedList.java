package Stack;

import java.util.ArrayDeque;

public class MainClassArrayAndLinkedList {
    public static void main(String[] args) {
//        Implementation for Stack using Array

//        StackUsingArray stack = new StackUsingArray(4);


//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        while(!stack.isEmpty()){
//            System.out.print(stack.pop() + " ");
//        }
//        stack.printStack();
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//
//        stack.printStack();


//<-------------------------------------------------------------------------------->

//        Implementation for Stack using LinkedList

//        StackUsingLinkedList stack = new StackUsingLinkedList();
//
//
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        while(!stack.isEmpty()){
//            System.out.print(stack.pop() + " ");
//        }

//        Implementation using ArrayDeque

        ArrayDeque<Integer> stackAD = new ArrayDeque<>();
        stackAD.push(4);
        stackAD.push(2);

        System.out.println(stackAD.pop());
        System.out.println(stackAD.pop());
    }
}
