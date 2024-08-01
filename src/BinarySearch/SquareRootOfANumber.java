package BinarySearch;

public class SquareRootOfANumber {
    public static void main(String[] args) {
        int num = 45;
        System.out.println(sqrt(num));
    }
    public static int sqrt(int num){
        int l = 1;
        int r = num;
        int ans = -1;

        while(l<= r){
            int m = l + (r-l)/2;
            if(m*m == num)return m;
            if(m*m > num) r = m-1;
            else{ // if mid value is less than actual num.
                ans = m; // Store it in ans since it can be the answer.
                l = m+1;
            }

        }
        return ans;
    }
}
