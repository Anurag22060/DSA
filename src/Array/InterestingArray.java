package Array;

public class InterestingArray {
    public static void main(String[] args) {
        int arr[]={9,17};
        int solution = isInteresting(arr);
        System.out.println(solution);
    }
    public static int isInteresting(int[] arr) {
    //Solution 1

//        int odd = 0;
//
//        for (int i = 0; i < arr.length; ++i)
//        {
//            if (arr[i] % 2 == 1)
//            {
//                ++odd;
//            }
//        }
//
//        if (odd % 2 == 1)
//        {
//            return 0;
//        }
//        else
//        {
//            return 1;
//        }


        //Solution 2 :- optimisted solution

        if (arr.length == 1) {
            return arr[0] == 0 ? 1 : 0;
        }

        int xorResult = 0;
        for (int num : arr) {
            xorResult ^= num;
        }
       if(xorResult % 2 == 1){
           return 0;
       }
       return 1;

    }
}
