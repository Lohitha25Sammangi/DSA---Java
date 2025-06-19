package methods;
import java.util.*;
public class Prime_Armstrong_Num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        isPrime(n);
        System.out.println("3 digit Armstrong numbers are: ");
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static void isPrime(int n){
        if(n<=1){
            System.out.println(n+" is not a prime number");
            return; 
        }
        int c=2;
        while(c*c <=n){
            if(n%c==0){
                System.out.println(n+" is not a prime number");
                return;
            }
            c++;
        }
        if(c*c > n){
            System.out.println(n+"is a prime number");
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
}
