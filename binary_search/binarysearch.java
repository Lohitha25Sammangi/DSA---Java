package binary_search;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        System.out.println(BinarySearch(arr,6));
    }
    static int BinarySearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                e=mid-1;
            } 
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
