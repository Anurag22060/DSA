package BinarySearch;
//Implement Lower Bound
public class FloorInsortedArrayORLowerBound {
    public static void main(String[] args) {
        long[] arr = {3, 5, 8, 15, 19};
        int n = 5;
        long x = 9;
        int ind = findFloor(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
    public static int findFloor(long arr[], int n, long x) {
        int l = 0;
        int r = n-1;
        int floorIndex =-1;

        while(l<=r){
            int m = l+(r-l)/2;

            if(arr[m] == x)return m;
            else if( x < arr[m]) r = m-1;
            else if(x > arr[m]){
                floorIndex = m;
                l = m+1;}
        }
        return floorIndex;
    }

//    Code 2

    public static int LowerBound(int a[],int k){
        int l =0;
        int r = a.length-1;
        int ans = -1;

        while(l<=r){
            int m = l + (r-l)/2;

            if(k <= a[m]){
                r = m-1;
            } else if (k >   a[m]) {
                ans = m;
                l = m+1;
            }
        }
        return ans;
    }
}

