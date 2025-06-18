import java.util.*;
public class primes {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n=s.nextInt();
        if(n<=1){
            System.out.println(n+" is neither a prime nor composite number!!");
            return;
        }
        int c=2;
        while(c<= Math.sqrt(n)){
            if(n%c==0){
                System.out.println(n +" is not a prime number");
                return;
            }
            c++;
        }
        System.out.println(n +" is a prime number");
    }
}
