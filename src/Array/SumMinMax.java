package Array;

import java.util.Arrays;

public class SumMinMax {
    public static void main(String[] args) {
    int nums[] ={-10,4,2,6,5};
        System.out.println(SumOfMinMax1(nums));
        System.out.println(SumOfMinMax(nums));

    }
    public static int SumOfMinMax1(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[0] + nums[n-1];

        return sum ;
  }


    public static int SumOfMinMax(int nums[]) {
        int max1 = Integer.MIN_VALUE; // Corrected initialization
        int min1 = Integer.MAX_VALUE; // Corrected initialization

        for (int i = 0; i < nums.length; i++) {
            max1 = Math.max(max1, nums[i]); // Corrected comparison
            min1 = Math.min(min1, nums[i]); // Corrected comparison
        }

//        System.out.println(max1);
//        System.out.println(min1);

        int sum = max1 + min1;

        return sum;
    }

}
