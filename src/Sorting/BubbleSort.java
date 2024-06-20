package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
    int a[] ={9,5,3,4,1,2};
    bubbleSort(a);
        for(int e:a){
            System.out.print(e + " ");
        }
    }
    static void bubbleSort(int a[]){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            boolean didISwap = false ;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j+1]<a[j]){
                    int temp =a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;

                    didISwap =true ;
                }
            }
            if(!didISwap) break ;
        }

    }
}
