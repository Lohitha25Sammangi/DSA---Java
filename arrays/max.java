package arrays;
public class max {
    public static void main(String[] args){
        int[] arr={2,44,34,22,5,9,6};
        System.out.println(max_s_e(arr));
        System.out.println(maxRange(arr,2,6));
    }
    static int max_s_e(int[] arr){
        int s=0,e=arr.length-1;
        if(s>=e){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int max_val=Integer.MIN_VALUE; 
        while(s<(arr.length/2)){
            if(arr[s]>arr[e] && arr[s]>max_val){
                max_val=arr[s];
            }
            if(arr[e]>arr[s] && arr[e]>max_val){
                max_val=arr[s];
            }
            s++;
            e--;
        }
        return max_val;
    }
    static int maxRange(int[] arr,int s,int e){
        if(s>=e){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int max_val=Integer.MIN_VALUE; 
        while(s<(arr.length/2)){
            if(arr[s]>arr[e] && arr[s]>max_val){
                max_val=arr[s];
            }
            if(arr[e]>arr[s] && arr[e]>max_val){
                max_val=arr[s];
            }
            s++;
            e--;
        }
        return max_val;
    }
}
