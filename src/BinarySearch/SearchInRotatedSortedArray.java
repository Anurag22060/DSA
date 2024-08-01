package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int a[] = {10,11,13,14,1,2,4,6,7,9};
        int k = 7;
        System.out.println(SearchInRotatedArray(a,k));
    }
    public static int SearchInRotatedArray(int a[],int k){
        int l = 0;
        int r= a.length-1;

        while(l<=r){
            int m = l + (r-l)/2;
            if(a[m] == k){
                return m;
            }
            if(a[l] <= a[m]){ // Left part is sorted
                if(a[l] <= k && k < a[m]){
                    r = m-1;
                }
                else{
                    l = m+1;
                }

            }
            else{// Right part is sort
                if(a[m] < k && k <= a[r]){
                    l = m+1;
                }
                else{
                    r = m-1;
                }
            }
        }
        return -1;
    }
}
