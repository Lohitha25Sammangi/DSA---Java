import java.util.*;
public class input {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rollnum=s.nextInt();
        System.out.println("Roll No. is "+rollnum);
        String Branch=s.next();
        System.out.println("Branch is "+Branch);
        char section=s.next().charAt(0);
        System.out.println("section is "+section);
        float CGPA=s.nextFloat();
        System.out.println("CGPA is "+CGPA);

    }
}
