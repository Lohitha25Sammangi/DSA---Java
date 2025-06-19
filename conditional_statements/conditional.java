package conditional_statements;
import java.util.*;
public class conditional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=sc.nextInt();
        //if-else statement
        if(age>=18){
            System.out.println("You are eligible for voting!");
        }else{
            System.out.println("You are not eligible for voting!");
        }
        System.out.println("Plese enter your marks:");
        float marks=sc.nextInt();
        //if-else-if ladder
        if(marks>=90){
            System.out.println("Your grade is A+");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Your grade is A");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Your grade is B");
        }
        else if(marks>=60 && marks<70){
            System.out.println("Your grade is C");
        }
        else{
            System.out.println("You are Failed!!!!!");
        }
    }
}
