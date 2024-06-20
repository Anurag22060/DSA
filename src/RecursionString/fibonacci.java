package RecursionString;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibOfN(6));
    }
    static int fibOfN(int n){
    if (n<=1) return n;
    return fibOfN(n-1) + fibOfN(n-2);
    }
}
