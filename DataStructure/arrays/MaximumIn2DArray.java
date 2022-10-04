package DataStructure.arrays;

import java.util.Arrays;

public class MaximumIn2DArray {
    public static void main(String[] args) {
                int[][] array= {
                        {10,22,23},
                        {20,23,9,85, 185},
                        {25,2}
                };
        System.out.println(Max(array));
            }

            static int Max(int[][] array){
            int  max = Integer.MIN_VALUE;
                for (int row = 0; row < array.length; row++) {
                    for (int colomn = 0; colomn < array[row].length ; colomn++) {
                        if (array[row][colomn]> max){
                          max= array[row][colomn];
                        }
                    }
                }
                return max;
            }
        }



