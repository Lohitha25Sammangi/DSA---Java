package binary_search;

public class leetcode33RBS {
    public static void main(String[] args){
        int[] rotated_arr={6,1,2,3,4,5};
        System.out.println(search(rotated_arr,3));
    }
    static int search(int[] arr,int target){
        int pivot=find_pivot(arr);
        if(arr.length==0 || target>arr[pivot]){
            return -1;
        }
        if(pivot==-1){
            return binary_search(arr,target,0,arr.length-1);
        }
        if(target==arr[pivot]){
            return pivot;
        }
        if(target>arr[0]){
            return binary_search(arr,target,0,pivot);
        }
        return binary_search(arr,target,pivot+1,arr.length-1);
        
    }
    static int find_pivot(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>s && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<nums[s]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return -1;
    } 
    static int binary_search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
