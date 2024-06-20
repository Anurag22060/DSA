package Queue;

import java.util.ArrayDeque;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
    int a[] = {2,-3,-1,4,-5,-3,2,1,4};
    int ans[] = firstNegativeInWindow(a,3);
    for(int e : ans){
        System.out.print(e + " ");
    }
    }
    public static int[] firstNegativeInWindow(int a[],int k){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        while(i<k){
            if(a[i]<0){
                dq.offerLast(a[i]);
            }
            i++;
        }

        int n = a.length;
        int ans[] = new int[n-k+1];
        for(;i<n;i++){
            if(dq.isEmpty()){
                ans[i-k] = 0;
            }
            else{
                ans[i-k] = dq.peekFirst();
            }

            if(!dq.isEmpty() && a[i-k] == dq.peekFirst()){
                dq.pollFirst();
            }
            if(a[i]<0){
                dq.offerLast(a[i]);
            }
        }
        if(dq.isEmpty()){
            ans[n-k] = 0;
        }
        else{
            ans[n-k] = dq.peekFirst();
        }
        return ans;
    }

}
