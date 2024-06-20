package Array;

import java.util.*;

public class TwoSumProblem {
    public static void main(String[] args) {

        int a[] ={4,2,2,2,1,1,1,-1,-3,0,1,2,3,3,3};
        int sum = 5 ;
        Arrays.sort(a);

        List<List<Integer>> ans = twoSum(a,sum,0);

        System.out.println(ans);

    }

     static List<List<Integer>> twoSum(int a[],int sum,int startFrom){

        int l = startFrom;
        int r = a.length - 1 ;
        List<List<Integer>> ans = new ArrayList<>();

        while(l<r){

            if(l > startFrom && a[l] == a[l-1]){
                l++;
                continue;
            }
            if(r < a.length -1 && a[r] == a[r+1]){
                r--;
                continue;
            }

            if(a[l]+ a[r] < sum){
                l++;
            } else if (a[l] + a[r] > sum) {
                r--;
            }
            else{
                List<Integer> temp = new ArrayList<>();

                temp.add(a[l]);
                temp.add(a[r]);

                ans.add(temp);
                l++;
                r--;


            }

        }

        return ans;





    }




}
