package binary_search;
import java.util.*;
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,4,8,8,9};
        int[] res=searchRange(arr,8);
        System.out.println(Arrays.toString(res));
    }
    static int[] searchRange(int[] arr,int target){
        int[] res={-1,-1};
        res[0] = search(arr,target,true);
        if(res[0]!=-1){
            res[1]=search(arr,target,false);
        }
        return res;
    }
    static int search(int[] arr,int target,boolean findstartIndex){
        int ans=-1;
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                if(findstartIndex){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
