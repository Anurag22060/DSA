package Array;

import java.util.Arrays;

public class MakeMatrixEqual {
    public static void main(String[] args) {
        int a[][]={{3,63,42},
                   {18,12,12},
                   {15,21,18},
                   {33,84,24}};
        int k = 3;
        System.out.println(makeMatrixEqual(a,k));
    }

    static int makeMatrixEqual(int a[][],int k){
        int n = a.length;
        int m = a[0].length;
        if(n ==0) return  0;
        int total = n * m;
        int b[] = new int[total];
//Convert matrix into array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i * m + j] = a[i][j];

            }
        }
        Arrays.sort(b);
        int median = b[total / 2];

//        For analysing values below loop can be used.

//        for (int i = 0; i < total; i++) {
//            System.out.println(b[i] + " " + makeMatixHelper(b,b[i],k));
//        }

        return makeMatixHelper(b,median,k);
    }

    static int makeMatixHelper(int b[],int m,int k){
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if( Math.abs(b[i] - m) % k != 0){ return -1;} // Check if b & m are divisible by k.
            else{
                count+= Math.abs(b[i] - m) / k;
            }
        }
        return count;
    }
}
