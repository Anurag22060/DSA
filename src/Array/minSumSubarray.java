package Array;

public class minSumSubarray {
    public static void main(String[] args) {
    int a[] = {1,2,5,6,7,2};
    int target = 7;
    System.out.println(minimumSumSubarray(a,target));
    }

    public static int minimumSumSubarray(int a[],int target){
        int l=0,r=0;
        int x= -1,y=-1;
        int curSum = 0;
        int minLength = Integer.MAX_VALUE;
        int n= a. length;
        while(r<n){
            curSum += a[r];
            while(curSum >= target){
//                minLength = Math.min(minLength, r-l+1);
                if(r-l+1 < minLength){
                    minLength = r-l+1;
                    x=l;
                    y=r;
                }
                curSum -= a[l];
                l++;
            }
            r++;
        }
        if (minLength == Integer.MAX_VALUE){
            minLength = 0;

        }

        System.out.println(x +" "+ y);
        return minLength;
    }
}
