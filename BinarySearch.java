import java.util.*;

public class BinarySearch {
   static boolean binarySearch(int[] arr,int k){
        int len=arr.length;
        int low=0;
        int high=len-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k)return true;
            if(mid>k){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=9;
        boolean result=binarySearch(arr,target);
        if(result)System.out.println("true");
        else
        System.out.println("false");

    }
}
