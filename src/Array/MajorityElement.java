package Array;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {1};
        int result = majorityElement(nums);
        System.out.println(result);

    }
    public static int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int index = 0;
        int value = 0;
        for (int i = 1; i < n; i++) {

            if (nums[index] == nums[i]) {
                count++;
            } else {
                count = 1;
            }
            if (count > (n / 2)) {
                value = nums[index];
            }

            index++;

        }
        return value;
    }
}
