package DataStructure.BitwiseAndNumber;

public class Numberones {
    public static void main(String[] args) {
        System.out.println(find(7));
    }

    public static int find(int n){
        int count=0;
        while(n>0){
            count+=n^1;
            n>>=1;
            count++;

        }
        return count;
    }
}
