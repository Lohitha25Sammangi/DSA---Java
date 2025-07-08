package OOP.Introduction;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Student[] students=new Student[5];
       System.out.println(Arrays.toString(students));
       Student Lohitha=new Student(17,"Lohitha",90.3f);
       //Lohitha.rollNo=101;
       //Lohitha.name="Lohitha Sammangi";
       //Lohitha.marks=9.36f
       Lohitha.change_Name("Movie Lover");
       Lohitha.greeting();


       //System.out.println(Lohitha); 
       System.out.println(Lohitha.rollNo); 
       System.out.println(Lohitha.name);
       System.out.println(Lohitha.marks);
       Lohitha.change_Name("Shoe Lover");
       Lohitha.greeting();
       System.out.println(Lohitha.name);
       Student random=new Student(Lohitha);
       System.out.println(random.rollNo); 
       System.out.println(random.name);
       System.out.println(random.marks);

       Student random2=new Student();
       System.out.println(random2.name);


       Student one=new Student();
       Student two=one;
       System.out.println(one.name);
       one.name="Something Something";
       System.out.println(one.name);
       System.out.println(two.name);
    }
}
class Student{
    int rollNo;
    String name;
    float marks;
    Student(){
        this(14,"default person",100);
    }
    Student(Student other){
        this.rollNo=other.rollNo;
        this.name=other.name;
        this.marks=other.marks;
    }
    Student(int rollNo,String name,float marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    void change_Name(String newname){
        this.name=newname;
    }
    void greeting(){
        System.out.println("Hello! My name is "+this.name);
    }
}
