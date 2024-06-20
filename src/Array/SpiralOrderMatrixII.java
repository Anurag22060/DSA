package Array;

import java.util.*;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        SpiralOrderMatrixII solution = new SpiralOrderMatrixII();

        // Test cases
        int[] testCases = {3, 4};
        for (int N : testCases) {
            int[][] result = solution.generateMatrix(N);
            System.out.println("Output for N = " + N + ":");
            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int N) {
        int[][] matrix = new int[N][N];
        int top = 0, bottom = N - 1, left = 0, right = N - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Traverse left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }
}
