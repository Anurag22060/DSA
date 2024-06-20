package Queue;

import java.util.*;
import java.util.Queue;

public class MinimumNoOfKConsecutiveBitsFlip {
    public static void main(String[] args) {
        int a[] = {0,0,0,1,0,1,1,0};
        int k = 3;
        System.out.println(flipbits(a,k));
    }
    static int flipbits(int a[],int k){
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if(q.size() % 2 != 0){ // (q.size() & 1 != 0)
                a[i] = a[i] ^ 1 ;
            }
            if(a[i] == 0){
                if(i+k >n){
                    return -1;
                }
                count++;
                q.offer(i+k-1);

            }
            if(!q.isEmpty() && q.peek()== i){
                q.poll();
            }
        }
        return count;
    }
}
