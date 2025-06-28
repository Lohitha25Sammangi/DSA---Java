package Patterns;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        int n=5;
        for(int i=1;i<2*n;i++){
            int totalCols= i>5 ?2*n-i  : i;
            for(int j=0;j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int spaces=1;spaces<n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
