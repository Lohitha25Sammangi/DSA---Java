package conditional_statements;

public class controls {
    public static void main(String[] args){
        int c=1,num=2;
        while(c<=10){
            System.out.println(num+" * "+c+" = "+num*c);
            c++;
        }

        for(int i=0;i<5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int num1=1;
        do{
            if((num1 % 2)==0){
                System.out.print(num1+" ");
            }
            num1++;
        }while(num1 <=10);
    }
}
