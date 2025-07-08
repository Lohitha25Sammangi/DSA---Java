package OOP.staticExmp;

public class Main {
    public static void main(String[] args) {
        Human lohitha=new Human(20, "Lohitha", 10000, false);
        Human sai=new Human(26, "Sai Kumar", 30000, true);

        System.out.println(lohitha.population);
        System.out.println(sai.population);
        System.out.println(Human.population);
        Main obj1=new Main();
        obj1.fun2();
        fun();
    }
    static void fun(){
        //greeting();

        Main obj=new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello world!!");
    }

}
