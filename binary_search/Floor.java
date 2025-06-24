package binary_search;
import java.util.*;
public class Floor {
    public static void main(String[] args) {
        int[] arr={23, 24, 45, 56, 67, 78};
        System.out.println(Arrays.toString(arr));
        int index=floor1(arr, 57);
        if(index != -1){
            System.out.println(arr[index]);
        }
    }
    static int floor1(int[] arr,int target){
        if(arr.length==0 || target>arr[arr.length-1]){
            return -1;
        }
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return e;
    }
}
