package binary_search;

import java.util.Arrays;

public class ceiling {
    public static void main(String[] args) {
        int[] arr={23, 24, 45, 56, 67, 78};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[Ceiling(arr, 57)]);
    }
    static int Ceiling(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        if(target>arr[arr.length-1]){
            return -1;
        }
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return (mid);
            }
            else if(target<arr[mid]){
                e=mid-1;
            } 
            else{
                s=mid+1;
            }
        }
        return s;
    }

}
