package DataStructure.Reccursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,3,4,9,11,13,45,98,999,1003};
        int target = 1003;
        System.out.println(BS(arr,target,0,arr.length-1));
    }

    public static int BS(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid= start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid] > target) {
            return BS(arr,target,start,mid-1);
        }
        return BS(arr,target,mid+1,end);
        
    }
}
