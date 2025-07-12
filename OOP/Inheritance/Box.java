package OOP.Inheritance;

public class Box {
    private double l;
    double w;
    double h;
    //double weight;
    static void Greetings(){
        System.out.println("Hey! I am in Box class, Greetings!!");
    }
    public double getL(){
        return l;
    }
    Box(){
        //super(); calls Object class
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    Box(double l,double w,double h){
        System.out.println("Box class is running");
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public void information(){
        System.out.println("Box class is running");
    }
}
