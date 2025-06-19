package methods;
import java.util.*;
public class changeValue {
    public static void main(String[] args){
        int[] arr={12,13,14,15,16,17};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
