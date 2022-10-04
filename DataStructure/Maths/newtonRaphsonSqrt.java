package DataStructure.Maths;

public class newtonRaphsonSqrt {
    public static void main(String[] args) {
        int n=49;
        System.out.println(sqrt(n));
    }

    public static double sqrt(double n){
        //assigning n to x;
        double x= n;
        //initializing the root
        double root;
        //running the while loop till this condition met
        while(true){
            root= 0.5* (x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
