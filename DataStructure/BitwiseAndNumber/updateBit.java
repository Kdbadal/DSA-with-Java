package DataStructure.BitwiseAndNumber;

public class updateBit {
    public static void main(String[] args) {
        update(15,3,0);
    }

    public static void update(int n,int k,int operation) {
        if(operation==1){
            int mask= 1<<k;
            int ans= mask|n;
            System.out.println(ans);
        }
        if (operation == 0) {
            int mask= 1<<k;
            int notmask=~mask;
            int ans2= notmask&n;
            System.out.println(ans2);
        }
    }
}
