package Patterns;

public class patterns3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){
            int totalSpaces=i>n?i-n:n-i;
            for(int spaces=1;spaces<=totalSpaces;spaces++){
                System.out.print(" ");
            }
            int totalCols=i>n?2*(2*n-i):2*i;
            int count=i>n?2*n-i:i;
            for(int j=1;j<totalCols;j++){
                if(j>=(totalCols+1)/2){
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(count);
                    count--;
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            int count=i;
            for(int j=1;j<2*i;j++){
                if(j>=(2*i+1)/2){
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(count);
                    count--;
                }
            }
            System.out.println();
        }
    }
}
