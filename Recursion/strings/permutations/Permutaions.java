package Recursion.strings.permutations;

import java.util.ArrayList;

public class Permutaions {
    public static void main(String[] args) {
        String str="abc";
        System.out.println('a'+0);
        permutations_print("",str);
        System.out.println();
        ArrayList<String> res=permutations_list("", str);
        System.out.println(res);
        System.out.println(permutations_count("","abc"));
    }

    static void permutations_print(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations_print(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> permutations_list(String p,String up){
        ArrayList<String> outer=new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            outer.addAll(permutations_list(f+ch+s,up.substring(1)));
        }
        return outer;
    }
    static int permutations_count(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count = count + permutations_count(f+ch+s,up.substring(1));
        }
        return count;
    }
}

