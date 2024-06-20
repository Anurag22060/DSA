package Stack;

import java.util.ArrayDeque;

//Implement min stack with O(1) space and time complexity
public class SpecialStack {
    ArrayDeque<Integer> stack;
    int min;
    public SpecialStack(){
        stack = new ArrayDeque<>();
    }
    public void push(int x){
        if(stack.isEmpty()){
            min = x;
            return;
        }
        if(x< min){
            stack.push(2 * x - min);
            min = x;
        }
        else{
            stack.push(x);
        }
    }
    public int pop(){
        if(stack.isEmpty()){
            return -1;
        }
        int y = stack.pop();
        if(y< min){
            int nextMin = 2*min -y;
            int temp = min;
            min = nextMin;
            return temp;
        }
        return  y;
    }
    public int getMin(){
        if(stack.isEmpty()){
            return -1;
        }
        return min;
    }

}
