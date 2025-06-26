package Sorting;
import java.util.*;
public class bubble {
    public static void main(String[] args) {
        int[] arr={44,66,22,33,55,88,77,99};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean isSwap=false;
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    isSwap=true;
                    swap(arr,j,j-1);
                }
            }
            if(!isSwap){
                break;
            }
        }
        return;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
