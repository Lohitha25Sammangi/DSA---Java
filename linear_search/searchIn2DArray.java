package linear_search;
import java.util.*;
public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {2,4,5,7},
            {45,78,67,35},
            {56,8,90,76,100}
        };
        int[] res=search(arr,100);
        System.out.println(Arrays.toString(res));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target){
        int row=0,col=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max_value=Integer.MIN_VALUE;
        for(int[] row:arr){
            for(int num:row){
                if(num>max_value){
                    max_value=num;
                }
            }
        }
        return max_value;
    }
}
