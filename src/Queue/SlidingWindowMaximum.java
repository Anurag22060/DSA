package Queue;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
    int a[] = {2,5,1,3,2,1,4,5};
    int ans[] = slidingWindow(a,3);

    for(int e :ans){
        System.out.print(e + " ");
    }
    }

    public static int[] slidingWindow(int a[], int k){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i = 0;
        while(i<k){
            while(!dq.isEmpty() && dq.getLast() < a[i]){
                dq.pollLast();
            }
            dq.offerLast(a[i]);
            i++;
        }
        int n = a.length;
        int ans[] = new int[n-k+1];

        for(;i<n;i++){
            ans[i-k] = dq.peekFirst();
            if(a[i-k] == dq.peekFirst()){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && dq.getLast() < a[i]){
                dq.pollLast();
            }
            dq.offerLast(a[i]);
        }
        ans[n-k] = dq.peekFirst();
        return ans;
    }

}
