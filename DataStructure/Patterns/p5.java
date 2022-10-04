package DataStructure.Patterns;
//pattern 5
// ******
//  *****
//   ****
//    ***
//     **
//      *


public class p5 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <=n; i++) {
            //forspaces
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            //for *
            for (int k = n; k >=i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
