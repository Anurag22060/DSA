package arrays;

import java.sql.SQLOutput;

public class basicsOfArrays {
    public static void main(String[] args) {
        int [][] matrix = new int [3][3];
        int value =1 ;
        for (int i =0;i< matrix.length ; i++){
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] =value;
                value++;
            }
        }
        int sum =0 ;
        for(int[] row : matrix){
            for(int num: row)
            {
                sum +=num ;
            }
        }
        System.out.println(sum);
    }

}
