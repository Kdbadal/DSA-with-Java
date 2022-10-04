package DataStructure.Reccursion;

public class printNumbers {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if(n==5){
            //base condition where recursion will stop making new calls
            System.out.println(5);
            return;
            // no base condition will be create infinite function calling
        }
        System.out.println(n);
        print(n+1); // function is calling again and again by adding 1
        //every function ca will take seprate
    }
}
