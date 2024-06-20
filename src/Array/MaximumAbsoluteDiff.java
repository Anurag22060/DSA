package Array;

public class MaximumAbsoluteDiff {

    public static void main(String[] args) {
        int a[] = {12,9,8,2,11,5,4};
        System.out.println(maximumDiff(a));
        System.out.println(maximumDiff1(a));
    }
//    Method 1 :- By creating and storing values in arrays
    static int maximumDiff(int a[]){
        int n = a.length;
        int aipi[] = new int[n];
        int aimi[] = new int[n];

        for (int i = 0; i<n ; i++) {
            aipi[i] = a[i]+i;
            aimi[i] = a[i]-i;
        }
        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

    for(int e: aipi){
        minaipi = Math.min(minaipi,e);
        maxaipi = Math.max(maxaipi,e);
    }

    for(int e: aimi){
            minaimi = Math.min(minaimi,e);
            maxaimi = Math.max(maxaimi,e);
    }

    int diffaipi = maxaipi - minaipi;
    int diffaimi = maxaimi - minaimi;

    return Math.max(diffaipi,diffaimi);
    }


//    Method 2 :- More optimised solution

    static int maximumDiff1(int a[]){
        int n = a.length;


        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for (int i = 0; i<n ; i++) {
            minaipi = Math.min(minaipi,a[i]+i);
            maxaipi = Math.max(maxaipi,a[i]+i);
            minaimi = Math.min(minaimi,a[i]-i);
            maxaimi = Math.max(maxaimi,a[i]-i);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi,diffaimi);
    }


}


