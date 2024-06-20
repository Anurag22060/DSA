package Stack;

import java.util.Stack;

public class LongestValidParanthesis {
    public static void main(String[] args) {
        String exp = ")(())()";
        System.out.println(longestValidParanthesis(exp));
    }
    public static int longestValidParanthesis(String s){
        Stack<Integer> stack = new Stack<>();
        int max =0 ;
        int leftBoundry = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(i);
            else{
                if(stack.isEmpty()) leftBoundry = i;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max = Math.max(max,i-leftBoundry);
                    else max = Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }
}
