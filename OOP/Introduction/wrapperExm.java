package OOP.Introduction;

public class wrapperExm {
    public static void main(String[] args) {
        //int a=10;
        //int b=20;
        //Integer num=new Integer(45);
        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);

        final A lohi=new A("Lohitha");
        lohi.name="Other value";

        A obj;
        for(int i=0;i<10000000;i++){
            obj=new A("Random name");
        }

        
    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
class A{
    final int num=10;
    String name;
    A(String name){
        this.name=name;
    }
    protected void finalize() throws Throwable{
        System.out.println("Object is Destroyed");
    } 
}
