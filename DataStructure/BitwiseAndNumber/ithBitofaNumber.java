package DataStructure.BitwiseAndNumber;

public class ithBitofaNumber {
    public static void main(String[] args) {
        System.out.println(bit(14,0));
    }

    public static int bit(int n,int k){
        int mask = 1<<k;
        if ((mask & n    )==0){
            return 0;
        }
        else return 1;
    }
}
