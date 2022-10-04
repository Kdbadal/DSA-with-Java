package DataStructure.Patterns;
//pattern 4
//    *
//   **
//  ***
// ****
//*****

public class P4 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = n; j>=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
