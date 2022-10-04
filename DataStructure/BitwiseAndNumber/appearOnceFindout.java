package DataStructure.BitwiseAndNumber;

public class appearOnceFindout {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,2,3,4,5};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int uniue=0;
        for(int n:arr){
            uniue^=n;
        }
        return uniue;
     }
}
