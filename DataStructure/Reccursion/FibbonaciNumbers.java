package DataStructure.Reccursion;

public class FibbonaciNumbers {
    public static void main(String[] args) {
        int ans = fibo(9);
        System.out.println(ans);
    }
    public static int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
    }
}
