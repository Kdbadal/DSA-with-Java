package DataStructure.Patterns;

public class P8 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= i; j++) {
                //for spaces
                System.out.print(" ");
            }
            for (int k = n;k >= i; k--) {
                System.out.print("*");
            }
            for (int l = n-1; l >=i ; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

