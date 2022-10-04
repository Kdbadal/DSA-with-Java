package DataStructure.Patterns;
//diagnal
public class P9 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
              if(i>=1 && j<= i-1){
                  System.out.print("  ");
              }
              else System.out.print("*");
            }
            System.out.println();
        }
    }
}
