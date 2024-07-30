package BinarySearch;

public class CountOccurance {
    public static void main(String[] args) {
        int a[] = {4,4,5,5,5,8,9,9,15,15,16,17};
        int k = 5;
        int ans = CountOccuranceOfElem(a,k);
        System.out.println(ans);
    }
    public static int CountOccuranceOfElem(int a[],int k){
        int f0 = FirstOccuranceOfElement(a,k);
        if(f0==-1) return 0;
        int l0 = LastOccuranceOfElement(a,k);
        return l0-f0+1;
    }
    public static int FirstOccuranceOfElement(int a[],int k){
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
                r = m-1;
                ans = m;
            }
        }
        return ans;
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
