package DataStructure.arrays;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array= {
                         {10,22,23},
                         {20,23,9,85,85},
                         {25,2}
        };
        int target = 19;
        int[] ans = search(array,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] array, int target){
        for (int row = 0; row < array.length; row++) {
            for (int colomn = 0; colomn < array[row].length ; colomn++) {
                if (array[row][colomn]==target){
                    return new int[]{row,colomn};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
