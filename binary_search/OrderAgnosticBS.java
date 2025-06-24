package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr={-18,-3,0,2,6,7,8,55,66,77,88};
        int[] arr1={99,88,77,66,55,44,33,22,11,10};
        System.out.println(agnosticBS(arr,66));
        System.out.println(agnosticBS(arr1,33));
    }
    static int agnosticBS(int[] num,int target){
        if(num.length==0){
            return -1;
        }
        int s=0,e=num.length-1;
        boolean isAsc=num[s]<num[e];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(num[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<num[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(target<num[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}
