package Recursion.strings.SubsetsSubsequences_Strings;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str="bappleccad";
        System.out.println(remove_a(str));
        System.out.println(remove_a1(str));
        skip("",str);
        System.out.println(skipApple(str));
        System.out.println(skipAppNotApple(str));
    }
    static String remove_a(String str){
        StringBuilder ans=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c!='a'){
                ans.append(c);
            }
        }
        return ans.toString();
    }
    static String remove_a1(String str){
        if(str.length()==0){
            return " ";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return remove_a1(str.substring(1,str.length()));
        }else{
            return ch+ remove_a1(str.substring(1,str.length()));
        }
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0)!='a'){
            skip(p+up.charAt(0),up.substring(1,up.length()));
        }
        else{
            skip(p,up.substring(1,up.length()));
        }
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(6,str.length()));
        }else{
            return str.charAt(0)+skipApple(str.substring(1,str.length()));
        }
    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }else{
            return str.charAt(0)+skipAppNotApple(str.substring(1,str.length()));
        }
    }
}
