package linear_search;
import java.util.*;
public class linearsearchExmp {
    public static void main(String[] args) {
        int[] arr={23,4,3,6,7,8};
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter target value to search: ");
        int target=in.nextInt();
        if(search(arr,target)){
            System.out.println(target+" is found");
        }else{
            System.out.println(target+" is not found");
        }
        in.close();
    }
    static boolean search(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}
