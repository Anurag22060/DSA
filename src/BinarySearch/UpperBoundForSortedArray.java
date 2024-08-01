package BinarySearch;

public class UpperBoundForSortedArray {
    public static void main(String[] args) {
    int a[] = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
    int k = -1;
        System.out.println(UpperBound(a,k));
    }
    public static int UpperBound(int a[],int k){
        int l =0;
        int r = a.length-1;
        int ans = a.length;

        while(l<=r){
            int m = l + (r-l)/2;

            if(k < a[m]){
                ans = m;
                r = m-1;
            } else if (k >= a[m]) {
                l = m+1;
            }
        }
        return ans;
    }
}
