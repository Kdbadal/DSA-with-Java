package DataStructure.BinarySearch;

public class maxNoOfTargetinArray{
    public static void main(String[] args) {
        int[] array= {2, 6, 7, 9, 12, 26, 35, 45, 66, 75, 85, 95, 100, 222};
        int target = 100;
        int ans = BS(array,target);
        System.out.println(ans);
    }

    // giving an array and target
    static int BS(int[] arr, int target) {
        // initializing the start with 0
        int start = 0;
        // initializing the end with total length -1
        int end = arr.length - 1;

        // while loop will only run if start is less than or equalto to the end
        while (start <= end) {
            //formula for finding mid point
            int mid = start + (end - start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
