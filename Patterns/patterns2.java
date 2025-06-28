package Patterns;

public class patterns2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int spaces=0;spaces<n-i-1;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++){
                if(i==n-1 || j==0||j==i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<2*n;i++){
            int totalSpaces=i>5?i-n:n-i;
            for(int spaces=1;spaces<=totalSpaces;spaces++){
                System.out.print(" ");
            }
            int totalCols=i>5?2*(2*n - i):2*i;
            for(int j=1;j<totalCols;j++){
                if(j==1 || j== i*2-1 || j==2*(2*n - i)-1){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int spaces=0;spaces<i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<(2*n-2*i);j++){
                if(i==0 || j==1||j==(2*n-2*i)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=2*n;i++){
            int totalSpaces=i>5?i-n:n-i;
            for(int spaces=1;spaces<=totalSpaces;spaces++){
                System.out.print("*");
            }
            int totalCols=i>5 || i==n+1?2*(2*n - i):2*i;
            for(int j=1;j<=totalCols;j++){
                if(j==1 || j== i*2 || j==2*(2*n - i)){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int spaces=1;spaces<=totalSpaces;spaces++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
