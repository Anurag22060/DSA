package Bits_Manipulation_and_Maths;

public class BitsManipulation {
    public static void main(String[] args) {
//        int n = 13;
//        int i = 1;
//        int j = 2 ;
//        System.out.println(getIthBit(n,i));
//        System.out.println(setIthBit(n,i));
//        System.out.println(clearIthBit(n,i));
//        System.out.println(clearBitsInGivenRange(n,i,j));
//        System.out.println(clearTheLastSetBit(n));
//        System.out.println(countSetBit(n));
            int a[]={1,2,3,1,2,5};
            int ans[] = twoUniqueNumbers(a);
        System.out.println(ans[0] + " "+ ans[1]);
    }

    static int getIthBit(int n,int i){
        int mask = 1 << i;
//        int ans = (n & mask);
//
//        if(ans ==0){
//            return 0;
//        }
//        else{
//            return 1;
//        }
        return (n & mask)==0 ? 0:1;
    }

    static int setIthBit(int n,int i){
        int mask = 1<<i;
        return (n | mask);
    }
    static int clearIthBit(int n,int i){
       int mask = ~(1<<i);

       return (n & mask);
    }
    static int clearBitsInGivenRange(int n,int i,int j){
        int a = (~0 << j+1);
        int b = (1<<i)-1;
        int mask = (a | b);
        return (n & mask);
    }

    static int clearTheLastSetBit(int n){
//        when we do & (and) operation for n & (n-1) it automatically clears the last set bit

        return n & (n-1);
    }

    static int countSetBit(int n){
//        int count = 0;
//         while(n != 0){
//             if((n & 1) !=0 ){
//                 count++;
//             }
//             n = n >> 1;
//         }
//         return count;


//                OR
            int count = 0;
            while(n != 0){
                n = n & (n-1);
                count++;
            }
            return count;
    }

    static int[] twoUniqueNumbers(int a[]){
        int xor = 0;
        for(int e:a){
            xor = xor ^ e;
        }
        int mask = xor ^ (-xor);
        int firstNumber = 0;

        for(int e:a){
            if((mask & e) == 0){
                firstNumber = firstNumber ^ e;
            }

        }
        int secondNumber = xor ^ firstNumber;
        int ans[] = new int[2];
        ans[0] = firstNumber;
        ans[1] = secondNumber;
        return  ans;
    }

    static int xorQueries(int a[],int l,int r){
        int xor[] = new int[a.length];
        xor[0] = a[0];
        for (int i = 1; i <a.length ; i++) {
            xor[i] =
        }
    }
}
