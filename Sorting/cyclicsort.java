package Sorting;
import java.util.*;
public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        sort1_N(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2={5,0,2,3,1,4};
        sort0_N(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void sort1_N(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }
    static void sort0_N(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
