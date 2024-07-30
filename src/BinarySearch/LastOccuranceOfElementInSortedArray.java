package BinarySearch;

public class LastOccuranceOfElementInSortedArray {
    public static void main(String[] args) {
        int a[] = {4,4,5,5,5,8,9,9,15,15,16,17};
        int k = 5;
        int ans = LastOccuranceOfElement(a,k);
        System.out.println(ans);
    }
    public static int LastOccuranceOfElement(int a[],int k){
        int l= 0;
        int r= a.length;
        int ans = -1;

        while(l<=r){
            int m = l+ (r-l)/2;

            if(k < a[m]){
                r = m-1;
            }
            else if(k > a[m]){
                l = m+1;
            }
            else{
                l = m+1;
                ans = m;
            }
        }
        return ans;
    }
}
