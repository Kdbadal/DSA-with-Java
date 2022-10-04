package DataStructure.BitwiseAndNumber;

public class clearMSBtoIthbit {
    public static void main(String[] args) {
        System.out.println(clear(29,3));
    }

    public static int clear(int n,int k){
        int mask = 1<<k+1;
        int minusmask= mask-1;
        int notmask= ~minusmask;
        return notmask&n;

    }
}
