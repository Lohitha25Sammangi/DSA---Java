package methods;

public class Shadowing {
    static int x=90;
    public static void main(String[] args){
        System.out.println(x);//90
        int x; //the class variable at line 4 is shadowed by this x
       // System.out.println(x);//x variable is used when initialized
        x=40;
        System.out.println(x);
        fun(); 
    }
    static void fun(){
        System.out.println(x); 
    }
}
