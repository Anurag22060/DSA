package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] ={9,5,3,4,1,2};
        selectionSort(a);
        for(int e:a){
            System.out.print(e + " ");
        }
    }
    static void selectionSort(int a[]){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int min =i ;// assume i is the minimum index
            for (int j = 0; j <n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i]= temp;
        }
    }
}
