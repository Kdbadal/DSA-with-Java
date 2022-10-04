package DataStructure.BitwiseAndNumber;

public class clearBIt {
    public static void main(String[] args) {
        System.out.println(clear(15,3));
    }

    public static int clear(int n,int k){
       int mask = 1<<k;
       int notmask = ~mask;
       return notmask & n;
    }
}
