package DataStructure.arrays;

public class swapAlternative {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 7, 9, 1, 3, 5};
        swap(a);
    }

    public static int[] swap(int[] arr){
        for (int i = 0; i < arr.length; i+=2) {
            if (i+1 < arr.length){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    return arr;
    }
}
