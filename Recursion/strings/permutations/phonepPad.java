package Recursion.strings.permutations;

import java.util.ArrayList;
import java.util.List;

public class phonepPad {
    public static void main(String[] args) {
        String str="12";
    System.out.println(combinations("",str));
    }
    static List<String> combinations(String p,String up){
        List<String> outer=new ArrayList<>();
        if(up.isEmpty()){
            outer.add(p);
            return outer;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit)*3;i++){
            char ch=(char)('a'+i);
            outer.addAll(combinations(p+ch,up.substring(1)));
        }
        return outer;
    }
}
