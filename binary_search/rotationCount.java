package binary_search;

public class rotationCount {
    public static void main(String[] args) {
        int[] rotated_arr={2,3,4,5,6,7,1};
        System.out.println(find_count(rotated_arr));
    }
    static int find_count(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int s=0,e=arr.length;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<arr[s]){
               e=mid-1; 
            }
            else{
                s=mid+1;
            }
        }
        return 0;
    }
}
