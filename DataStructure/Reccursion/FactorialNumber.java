package DataStructure.Reccursion;

public class FactorialNumber {
    public static void main(String[] args) {
        int ans = fact(10);
        System.out.println(ans);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else return n*fact(n-1);
    }
}
