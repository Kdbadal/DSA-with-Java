package DataStructure.sortingAlgo;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insert(int @NotNull [] arr){
        int temp,j;  // temp for value and j for index
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
    }
}

