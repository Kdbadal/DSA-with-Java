package DataStructure.sortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selction(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selction(int[] arr){
        int temp=0;
          int min;

        for (int i = 0; i < arr.length; i++) {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
