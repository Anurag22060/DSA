package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] ={9,5,3,4,1,2};
        insertionSort(a);
        for(int e:a){
            System.out.print(e + " ");
        }

    }
    static void insertionSort(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int last = a[i];
            int swapIndex = i-1;

            while(swapIndex >=0 && a[swapIndex] > last ){
                swapIndex--;
            }
            for(int j =i; j>swapIndex+1;j--){
                a[j] = a[j-1];
            }
            a[swapIndex+1] =last;

        }




    }
}
