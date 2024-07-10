package Array;

public class MaxChunksToMakeSorted_2 {
    public static void main(String[] args) {
    int a[] = {3,1,4,6,5,8,7};
        System.out.println(MaxChunk2(a));


    }

    static int MaxChunk2(int[] a){
        int n = a.length;
        int[] left = new int[n];
        int [] right = new int [n];
        left[0] = a[0];
        right[n-1] = a[n-1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],a[i]);
        }
        for (int i = n-2; i >=0 ; i--) {
            right[i] = Math.min(right[i+1],a[i]);
        }
        int count = 0;
        for (int i = 0; i <n-1; i++) {
            if(left[i] <= right[i+1]){
                count++;
            }
        }
        return count+1;
    }
}
