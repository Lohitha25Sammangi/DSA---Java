package binary_search;

//searching in a infinite length of array
public class InfiniteArraySearch {
    public static void main(String[] args){
        int[] arr={23,24,25,26,27,28,34,35,36,39,45,65,66,67,68,69,78,88,89,91,92,93,94,95,96,97,100};
        int target=78;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int s=0,e=1;
        while(target>arr[e]){
            int temp=s;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return binarysearch(arr,target,s,e);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
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
