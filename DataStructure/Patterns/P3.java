package DataStructure.Patterns;
//pattern 4
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
//        * * * * * * * *
//        * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * *
//        * * * * * * * *
//        * * * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class P3 {
    public static void main(String[] args) {
        pattern(10);
    }

    static void pattern(int n){
        for(int i=0;i<=10;i++){
            System.out.print(" ");
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = n; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
