package DataStructure.Patterns;
//pattern 2
//*****
//****
//***
//**
//*

public class P2 {

    static void pyramid(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = n; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pyramid(10);
    }
}

