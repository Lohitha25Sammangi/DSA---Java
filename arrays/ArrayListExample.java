package arrays;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(35);
        list.add(23);
        list.add(5);
        list.add(5);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.remove(3);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.addFirst(23);
        list.addLast(50);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list.clone());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list.toArray());
        System.out.println(list.toString());
        System.out.println(list.contains(5));
        System.out.println(list.subList(3,5));
        System.out.println(list);
    }
}
