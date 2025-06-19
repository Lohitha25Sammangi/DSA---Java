package arrays;
import java.util.*;
public class Swap {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] nums){
        int s=0,e=nums.length-1;
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    } 

}
