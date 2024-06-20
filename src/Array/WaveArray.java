package Array;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
//        waveArrayNotExographic(a);
        waveArray(a);
        printArray(a);
    }
    static void printArray(int a[]){
        for(int e : a){
            System.out.print(e +" ");
        }
    }

    static void swap (int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]= temp;

    }

    static void waveArray(int a[]){
        Arrays.sort(a);
        int n =a.length;
        for (int i = 0; i < n; i+=2) {
            swap(a,i,i-1);
        }
    }

    static void waveArrayNotExographic(int a[]){

        int n=a.length;
        for (int i = 0; i < n; i+=2) {
            if(a[i] > a[i-1]){
                swap(a,i,i-1);
            }

            if(i<n-1 && a[i] > a[i+1]){
                swap(a,i,i+1);
            }

        }
    }
}
