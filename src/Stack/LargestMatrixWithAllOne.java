package Stack;

import java.util.ArrayDeque;

public class LargestMatrixWithAllOne {
    public static void main(String[] args) {
        int a[][] ={
                {1,0,1,0,0},
                {1,0,1,1,1},
                {1,0,1,1,1},
                {1,0,0,1,0}
        };
        System.out.println(largestMatrixWithAllOne(a));
    }

    static int largestMatrixWithAllOne(int a [][]){
        int row = a.length;
        int col = a[0].length;
        if(row == 0) return 0;
        int his[] = new int[col];
        int maxArea = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(a[i][j] == '0'){
                    his[j] = 0;
                }
                else{
                    his[j]++;
                }
            }
            int curArea = maxAreaInHistogram(his);
            maxArea = Math.max(maxArea,curArea);
        }
        return  maxArea;
    }
    static int maxAreaInHistogram(int a[]){
        int n = a.length;
        int ps[] = previousSmall(a);
        int ns[] = nextSmall(a);

        int max = 0;

        for (int i = 0; i < n; i++) {
            int curArea = (ns[i] - ps[i] -1 ) * a[i];
            max = Math.max(max,curArea);
        }
        return max;

    }

    static int[] previousSmall(int a[]){
        int n = a.length;
        int ans[] = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && a[stack.peek()] >=     a[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    static int[] nextSmall(int a[]){
        int n = a.length;
        int ans[] = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
