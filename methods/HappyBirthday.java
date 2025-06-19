package methods;
import java.util.*;
public class HappyBirthday {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter birthday baby name: ");
        String name=sc.next();
        sc.close();
        HappyBirthday_greet(name);
    }
    static void HappyBirthday_greet(String name){
        System.out.println("Happy Birthday "+name);
    }
}
