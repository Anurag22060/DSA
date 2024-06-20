package Array;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int minDiffChocolates(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int n = arr.length;

        int result = minDiffChocolates(arr, n, m);
        System.out.println("Minimum difference between maximum and minimum chocolates: " + result);
    }
}

