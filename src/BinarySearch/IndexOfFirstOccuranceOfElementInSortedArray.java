package BinarySearch;

public class IndexOfFirstOccuranceOfElementInSortedArray {
    public static void main(String[] args) {
    int a[] = {4,4,5,5,5,8,9,9,15,15,16,17};
    int k = 16;
    int ans = FirstOccuranceOfElement(a,k);
        System.out.println(ans);
    }
    public static int FirstOccuranceOfElement(int a[],int k){
        int l= 0;
        int r= a.length;


        while(l<=r){
            int m = l+ (r-l)/2;
            if(a[m] == k){
                while(m>= l && a[m] == k) {
                    m--;
                }
                return m+1;
            }

            else if(k < a[m]){
                r = m-1;
            }
            else if(k > a[m]){
                l = m+1;
            }
        }
        return -1;
    }
}
