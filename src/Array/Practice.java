package Array;

public class Practice {
    public static void main(String[] args) {
        int [] soln = arrayDisplay(4);
        System.out.println(soln);
    }

    public static int[] arrayDisplay(int n){

        int[] arr = new int[n*n];

        for (int i = 0; i < n*n; i++) {
            arr[i] = i;
            System.out.print(arr[i] + "\t");
        }


        return arr;
    }
}
