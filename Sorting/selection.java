package Sorting;
import java.util.*;
public class selection {
    public static void main(String[] args) {
        int[] arr={6,4,7,2,3};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int max=getMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMax(int[] arr,int a,int b){
            int max=0;
            for(int i=a;i<=b;i++){
                if(arr[i]>arr[max]){
                    max=i;
                }
            }
            return max;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
