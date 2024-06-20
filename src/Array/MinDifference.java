package Array;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.lang.*;

public class MinDifference {
    public static void main(String[] args) {
        int a[] = {12,9,8,2,11,5,4};
        List<List<Integer>> ans= minimumDiff(a);
        System.out.println(ans);

    }
        static List<List<Integer>> minimumDiff(int a[]){
                List<List<Integer>> ans =  new ArrayList<>();
                Arrays.sort(a);
                int n= a.length;
                int minDiff = Integer.MAX_VALUE;
                for (int i = 1; i <n ; i++) {

    //                if (a[i]-a[i-1] < minDiff) {
    //                    minDiff = a[i]-a[i-1];
    //                }
    //          short code for above code :-

                    minDiff = Math.min(minDiff,a[i]-a[i-1]);
                }
                for (int i = 1 ; i <n ; i++) {
                    if(a[i]-a[i-1] == minDiff){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(a[i-1]);
                        temp.add(a[i]);
                        ans.add(temp);

                    }
                }
                return ans;
        }
}
