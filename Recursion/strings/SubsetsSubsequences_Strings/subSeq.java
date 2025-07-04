package Recursion.strings.SubsetsSubsequences_Strings;
import java.util.*;
public class subSeq {
    public static void main(String[] args) {
        String str="abc";
        print_subsets("", str);
        System.out.println(subsets("",str).toString());
        subSeq_ASCII("", str);
        System.out.println(subseq_ASCII_Ret("", str));
    }
    static void print_subsets(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        print_subsets(p+ch, up.substring(1));
        print_subsets(p, up.substring(1)); 
    }
    static ArrayList<String> subsets(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsets(p+ch,up.substring(1));
        ArrayList<String> right=subsets(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subSeq_ASCII(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeq_ASCII(p+ch, up.substring(1));
        subSeq_ASCII(p, up.substring(1)); 
        subSeq_ASCII(p+ (ch+0), up.substring(1)); 
    }
    static ArrayList<String> subseq_ASCII_Ret(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseq_ASCII_Ret(p + ch, up.substring(1));
        ArrayList<String> second = subseq_ASCII_Ret(p, up.substring(1));
        ArrayList<String> third = subseq_ASCII_Ret(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}

