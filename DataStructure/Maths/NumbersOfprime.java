package DataStructure.Maths;
public class NumbersOfprime{

        public static void main (String[] args)
        {
            int n=2;
            boolean[] arr= new boolean[n+1];
            primes(n,arr);
        }

        public static int primes(int n,boolean[] arr){
            int count=0;
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i]){
                count++;
            }
        }
        return count;
    }
}

