package DataStructure.Maths;

public class gcdofArray {
    public static void main(String[] args) {
        int arr[]={4,58,5,56,12,33,56,55,85,52,100};
        System.out.println(gcd(arr));
    }

    static int gcd(int[] arr){
        int max=0;
        int min=1000;
        for (int i: arr){
            max= Math.max(max,i);
            min=Math.min(min,i);
        }
        return gcd2(max,min);
    }

    static int gcd2(int a, int b){
        if (a==0){
            return b;
        }
        return gcd2(b%a,a);
    }
}
