package methods;

public class scope {
    public static void main(String[] args){
        int a=10;
        String name="Lohi";
        {
            //int a=100;  //already initialized outside the block.hence not possible to initialize
            a=100;
            name="Sai";
            System.out.println(name+a);//the values which are initialized inside the block are printed
            int num=10;
            System.out.println(num);
            int c=99;
            System.out.println(c);
        }
        int c=990;
        System.out.println(c);//outside the block value is printed 
        System.out.println(name+a);
        //System.out.println(num);//num has scope within the block only

    }
}
