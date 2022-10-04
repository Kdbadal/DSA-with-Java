package DataStructure.Maths;

public class SquareRootbyBinarySearch {
    public static void main(String[] args) {
        int n=50;
        int p=3;
        System.out.println(root(n,p));
    }

    public static double root(int n,int p){
        int start=0,end=n;
        double rootofNumber=0.00;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if (mid*mid<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        double incr=0.1;
        for (int i = 0; i < p; i++) {
                while (rootofNumber* rootofNumber<=n){
                    rootofNumber+=0.1;
                }
                rootofNumber-=incr;
                incr/=10;
        }
        return rootofNumber;
    }
}
