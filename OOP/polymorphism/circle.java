package OOP.polymorphism;

public class circle extends shapes {
    @Override //this is called annotation
    void area(){
        System.out.println("Area of circle is pi * r * r");
    }
}
