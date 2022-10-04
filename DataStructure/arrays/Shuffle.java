package DataStructure.arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr= {3,6,9,10};
        System.out.println(shufflearray(arr,2));
    }

    public static int[] shufflearray(int[] arr,int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = arr[i / 2];
            } else {
                ans[i] = arr[n + i / 2];
            }
        }
        return ans;
    }
}
