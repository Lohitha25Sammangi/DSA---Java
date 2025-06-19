public class typeCasting {
       public static void main(String args[]) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        int convert_byte=(int)b;
        System.out.println(convert_byte);
        byte convert_int=(byte)i;
        System.out.println(convert_int);
        double convert_byte2=b;//type conversion or Widening
        System.out.println(convert_byte2);
        byte b1=(byte)i;
        //int num=d -->error
        int num=(int)d;//Type Casting or narrowing
        double result = (f * b) + (i / c) - (d * s);//Type Promoting
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);//Prints highest datatype in expression
    }
}

