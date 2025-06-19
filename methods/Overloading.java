package methods;

public class Overloading {
    public static void main(String[] args){
        fun(101);
        fun("Lohitha");
        sum(2,3);
        sum(2,3,4);
    }
    static void fun(int rollNo){
        System.out.println("My RollNo is: "+rollNo);
    }
    static void fun(String name){
        System.out.println("My name is : "+name);
    }
    static void sum(int a,int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    static void sum(int a,int b,int c){
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }
}
