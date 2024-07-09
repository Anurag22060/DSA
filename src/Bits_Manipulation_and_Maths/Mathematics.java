package Bits_Manipulation_and_Maths;

import java.util.*;

public class Mathematics {
    public static void main(String[] args) {
//
//        int n = 9;
//        System.out.println(isPrime(n));

//        int n = 100;
//        boolean isPrime[] = sieveOfEratosthenes(n);
//        for (int i = 0; i <= n; i++) {
//            if(isPrime[i]){
//                System.out.println(i);
//            }
//        }

        int a = 360;
        int b = 240;

        System.out.println(gcd(a,b));

    }
//    Prime Numbers
    static boolean isPrime(int n){
        for (int i = 2; i*i <= n ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
//      sieveOfEratosthenes
    static boolean[] sieveOfEratosthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i*i <=n ; i++) {  // O(n * log log n)
            for (int j = i * i; j <= n; j+= i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
//    Prime Queries
    static  int[] primeQueries(int q[][]){
        int n = q.length;
        int length = 0;
        for (int i = 0; i < n; i++) {
            length = Math.max(length,q[i][1]);
        }
        boolean isPrime[] = sieveOfEratosthenes(length);
        int count[] = new int [length+1];
        for (int i = 1; i <= length; i++) {
            if(isPrime(i)){
                count[i] = count[i-1]+1;
            }
            else{count[i] = count[i-1];}
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int leftcount = count[q[i][0]-1];
            int rightcount = count[q[i][1]];
              ans[i] =  leftcount- rightcount;
        }
        return ans;
    }

//    GCD

    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
