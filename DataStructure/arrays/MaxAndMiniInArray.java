package DataStructure.arrays;

public class MaxAndMiniInArray {
    public static void main(String[] args) {
        int[] array = {12, 36, 254, -6, -44, 85, 20, 15};
        System.out.println("your minimum number of array is = " + min(array));
        System.out.println("your maximum number of array is = " + max(array));
    }

    //assume this is not an empty array0
    static int min(int[] arr) {
        // assume first index is our answer
        int ans = arr[0];
        // if its not lets run the loop to find
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans)
            {
                ans = arr[i];
            }
        }
        // after ending all the loops return the answer
        return ans;

    }

    static int max(int[] arr) {
        // assume first index is our answer
        int ans = arr[0];
        // if its not lets run the loop to find
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) ans = arr[i];
        }
        // after ending all the loops return the answer
        return ans;

    }
}

