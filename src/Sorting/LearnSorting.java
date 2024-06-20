package Sorting;
// Place the last Number in the sorted position in an array

public class LearnSorting {

    public static void main(String[] args) {
    int a[]= {2,5,6,8,9,4};
    lastNumberInSortedPosition(a);
        for (int e:a) {
            System.out.print(e +" ");
        }
    }
    static void lastNumberInSortedPosition(int a[]){
        int n = a.length;
        int last = a[n-1];
        int swapIndex = n-2;

        while(swapIndex >=0 && a[swapIndex] > last ){
            swapIndex--;
        }

        for(int i =n-1; i>=swapIndex+2;i--){
            a[i] = a[i-1];

        }
        a[swapIndex+1] =last;
    }
}
