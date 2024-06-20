package RecursionString;

public class powerModulo {
    public static void main(String[] args) {
//        double a= 7;
//        int b= 7;
//        System.out.println(power(a,b));
        System.out.println(fastPower(7,7));
    }

    //Simple function to calculate power
//    static double power(double a, double b){
//        if(b == 0 ) return 1;
//
//        return a * power(a,b-1);
//    }

//    More optimised and fast function to calculate power

    static double fastPower(double a,int b){
        if(b == 0) return 1;

        if (b % 2 == 0){
            return fastPower(a*a,b/2);
        }
        else{
            return fastPower(a,b-1);
        }
    }
}
