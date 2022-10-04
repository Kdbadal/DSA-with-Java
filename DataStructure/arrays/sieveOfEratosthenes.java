package DataStructure.arrays;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n=50;
        boolean[] arr = new boolean[n+1];
        prime(n,arr);
    }

    public static void prime(int n,boolean[] arr){
        //checking in forloop till square root of n
        for (int i = 2; i*i <=n ; i++) {
             if (!arr[i]){
                 for (int j=i*2; j<=n ; j+=i) {
                    arr[j]=true;
                 }
             }
        }
        //printing the answer
        for (int i = 2; i <=n; i++) {
            if (!arr[i]){
                System.out.println(i+ " ");
            }
        }
    }
}
//time complexity will be o(n log(log n))
// space complexity will be o(n)