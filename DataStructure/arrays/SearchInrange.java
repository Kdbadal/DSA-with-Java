package DataStructure.arrays;

public class SearchInrange {
    public static void main(String[] args) {
        int[] array= {12,36,254,-6,54,85,20,15};
        int target = -6;
        int ans = linearSearch(array,target,2, 7);
        System.out.println(ans);
    }

    // just adding start and end variable for range and use that in loop
    public static int linearSearch(int[] Array, int target,int start, int end){
        //--// creating and erray and target value that we want to find
        if (Array.length == 0) {
            return -1;
        }

        for(int index=start;index<=end; index++){
            int element = Array[index];
            if(element == target){
                return index;
            }

        }
        return -1;

    }
}
