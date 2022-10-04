package DataStructure.Maths;

public class LCMusingGCD {
    public static void main(String[] args) {
        System.out.println(lcm(7,9));
    }

    static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        return (a/gcd(a,b)) *b;
    }
}
