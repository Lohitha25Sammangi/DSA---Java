package OOP.staticExmp;
//class test{
  //  static String name;
    //test(String name){
      //  test.name=name;
    //}
//}
public class innerClass {
    static class test{
        String name;
        public test(String name){
            this.name=name;
        }
        public String toString(){
            return name;
        }
    }
   public static void main(String[] args) {
    test a=new test("Lohi");
    test b=new test("Pallu");
    System.out.println(a);
    System.out.println(a.name);
    System.out.println(b.name);
   } 
}
