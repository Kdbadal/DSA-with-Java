package DataStructure.BitwiseAndNumber;

public class SetIthBitOfNumber {
    public static void main(String[] args) {
        System.out.println(set(18,3));
    }
    public static int set(int n,int k){
        int mask = 1<<k;
        return mask|n;
    }
}
