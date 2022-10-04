package DataStructure.BitwiseAndNumber;

public class EvenOdd {
    public static void main(String[] args) {
        int n =78;
        System.out.println(evenodd(n));
    }

    public static boolean evenodd(int n){
        return ((n&1)==1);
    }
}
