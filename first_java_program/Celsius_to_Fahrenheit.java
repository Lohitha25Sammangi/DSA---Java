import java.util.*;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter temp in C:  ");
        float tempC=s.nextFloat();
        float tempF=(tempC * 9/5)+32;
        System.out.println(tempC+"C = "+tempF);
    }
}
