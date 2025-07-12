package OOP.Inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight=weight;
        //super keyword is used for access the variadle in parent class directly
        //System.out.println(super.weight);  
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
