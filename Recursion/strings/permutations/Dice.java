package Recursion.strings.permutations;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceList("", 4));
        System.out.println(diceListFace("", 5,5));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> diceList(String p,int target){
        ArrayList<String> outer=new ArrayList<>();
        if(target==0){
            outer.add(p);
            return outer;
        }
        for(int i=1;i<=6&&i<=target;i++){
            outer.addAll(diceList(p+i,target-i));
        }
        return outer;
    }
    static ArrayList<String> diceListFace(String p,int target,int face){
        ArrayList<String> outer=new ArrayList<>();
        if(target==0){
            outer.add(p);
            return outer;
        }
        for(int i=1;i<=face&&i<=target;i++){
            outer.addAll(diceListFace(p+i,target-i,face));
        }
        return outer;
    }
}
