package Array;

public class RotateArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5,6,7};
        int k = 3;
        int ans[] = rotateArray(a,k);


            for(int e:ans) {
                System.out.print(e + " ");
            }
            System.out.println();

    }
    static int[] rotateArray(int[] nums,int k){
        int n = nums.length;
        int ans[] = new int [n];
        int temp[] = new int[2*n];

        for(int i =0;i<n;i++){
            temp[i] = nums[i];
            temp[i+n] = nums[i];
        }

        int offset = k % n;
        for(int i=0;i<n;i++){

            ans[i] = temp[i+(n-offset)];
        }
        return ans;
    }
    static void printArray(int a[]){
        for(int e:a) {
            System.out.print(e + " ");
        }
    }
}
