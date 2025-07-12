package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1=new Box(4);
        System.out.println(b1.getL());
        b1.information();
        Box b2=new Box(b1);
        //System.out.println(b1.l+" "+b1.w+" "+b1.h);
        //System.out.println(b2.l+" "+b2.w+" "+b2.h);

        BoxWeight b3=new BoxWeight();
        BoxWeight b4=new BoxWeight(4,4,4,5);
        System.out.println(b3.weight);
        //System.out.println(b4.l+" "+b4.w+" "+b4.h+" "+b4.weight);

        Box b5=new BoxWeight(2, 3, 4, 5);
        System.out.println(b5.w);

        //BoxWeight b6=new Box(2,3,4); //error


        BoxPrice bp1=new BoxPrice(5,30,600);
        System.out.println(bp1.cost);
        System.out.println(bp1.weight);
        //System.out.println(bp1.l+" "+bp1.w+" "+bp1.h);


        //BoxWeight box=new BoxWeight();
        Box.Greetings();
    }
}
