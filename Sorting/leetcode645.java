package Sorting;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class leetcode645 {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        int[] ans=new int[2];
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
              swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int  second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
