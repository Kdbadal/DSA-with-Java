package DataStructure.BinarySearch;

public class DessindingOrderArray {
    public static void main(String[] args) {
        int[] arr = {200,150,120,100,94,40,10,0,-5,-15,-24};
        int target = -5;
        int ans = DSO(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int DSO(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
