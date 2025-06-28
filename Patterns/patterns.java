package Patterns;

public class patterns {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int spaces=0;spaces<i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
