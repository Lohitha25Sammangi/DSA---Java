package OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape=new shapes();
        shapes Circle=new circle();
        shapes Square=new square();
        shapes Triangle=new triangle();
        shape.area();
        Circle.area();
        Square.area();
        Triangle.area();
        
    }
}
