package DataStructure.arrays;

public class LinearSEARCH {
    public static void main(String[] args){
        int[] num = {20,66,985,55,58,52,12,5};
        int target = 5;
        int ans = linearSearch(num,target);
        System.out.println(ans);
    }
    //---//creating a method or function for linear search of data(one by one)
    public static int linearSearch(int[] Array, int target){
        //--// creating and erray and target value that we want to find
        if (Array.length == 0) {
            return -1;
        }

        for(int index=0;index<Array.length; index++){
            int element = Array[index];
            if(target== Array[index] ){
                return element;
            }

        }
        return -1;

    }
}
