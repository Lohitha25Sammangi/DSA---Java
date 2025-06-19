package methods;
import java.util.*;
public class VarArgs {
    public static void main(String[] args){
        demo(2,4,5,7);
        fun(5,6,"Lohitha","Pallavai","Sai");
        fun("Lohitha","Pallavai","Sai");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
