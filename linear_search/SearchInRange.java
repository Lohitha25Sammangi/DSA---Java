package linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,3,21,34,56,78,90};
        System.out.println(search(arr,21,4,9));
    }
    static int search(int[] arr,int target,int s,int e){
        if(arr.length==0){
            return -1;
        }
        for(int i=s;i<=e;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
