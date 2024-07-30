package BinarySearch;

public class BinarySearchingIteratively {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,5,8,9,12,15};
        int k = 8;
        int l =0;
        int r = a.length-1;
        int ans = BinarySearchIter(a,k);
        int ans1 = BinarySearchRecursively(a,k,l,r);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static int BinarySearchIter(int a[], int k){
        int l = 0;
        int r = a.length-1;

        while(l<=r){
            int m = l + (r-l)/2;

            if(a[m] == k) return m;
            else if(k < a[m]) r = m-1;
            else if (k > a[m]) l = m+1;
        }
        return -1;
    }

    public static int BinarySearchRecursively(int a[], int k, int l,int r){
        if(l>r) return -1;
        int m = l + (r-l)/2;
        if(a[m] == k) return m;
        else if(k < a[m]) return BinarySearchRecursively(a,k,l,m-1);
        return BinarySearchRecursively(a,k,m+1,r);
    }
}
