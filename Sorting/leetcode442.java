package Sorting;

import java.util.ArrayList;
import java.util.List;

public class leetcode442 {
    public static void main(String[] args) {
       int[] arr={4,3,2,7,8,2,3,1};
       List<Integer> list=findDuplicates(arr);
       list.sort(null);
       System.out.println(list); 
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
