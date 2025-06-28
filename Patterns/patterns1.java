package Patterns;

public class patterns1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int spaces=1;spaces<n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int spaces=0;spaces<i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        int n1=5;
        for(int i=0;i<2*n1;i++){
            int totalSpaces=i>n1-1?2*n1-i-1:i;
            int totalCols=i>n1-1?(i-n1+1):n1-i;
            for(int spaces=0;spaces<totalSpaces;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
