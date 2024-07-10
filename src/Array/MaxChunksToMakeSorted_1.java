package Array;

public class MaxChunksToMakeSorted_1 {
    public static void main(String[] args) {
        int a[] = {4,1,2,0,3};
        System.out.println(maxChunks1(a));
    }
    static int maxChunks1(int a[]){
        if(a.length == 0) return 0;
        int chunks = 0;
        int maxSoFar = a[0];
        for(int i = 0; i < a.length; i++) {
           maxSoFar = Math.max(maxSoFar,a[i]);

           if(i == maxSoFar){
               chunks++;
           }
        }
        return  chunks;

    }
}
