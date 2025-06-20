package linear_search;
import java.util.*;
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={123400,-456,-0345,-3456,7890};
        
        //1st method
        ArrayList<Integer> res1=new ArrayList<>();
        ArrayList<Integer> res2=new ArrayList<>();
        ArrayList<Integer> res3=new ArrayList<>();
        for(int num: arr){
            if(No_of_digits(num)%2 == 0){
                res1.add(num);
            }
        }
        System.out.println(res1);
        //2nd method
        for(int num: arr){
            if(num<0){num=num*-1;}
            if((Integer.toString(num).length())%2 ==0){
                res2.add(num);
            }
        }
        System.out.println(res2);
        //3rd method
        for(int num: arr){
            if(num<0){num=num*-1;}
            if((int)(Math.log10(num)+1)%2 ==0){
                res3.add(num);
            }
        }
        System.out.println(res3);
    }
    static int No_of_digits(int num){
        if(num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}
