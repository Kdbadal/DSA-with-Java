package DataStructure.Maths;

public class perfectSquareroot {
    public static void main(String[] args) {
        int n=4225;
        System.out.println(sqrtn(n));
    }

    private static int sqrtn(int n) {
        int start=0,end=n,root=0;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid*mid==n){
               root=mid;
                return root;
            }
            if (mid*mid>n) end=mid-1;
            else start=mid+1;
        }
        return root;
    }
}
//time complexity= o(log n) because of binary search