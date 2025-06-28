package Patterns;
public class Pascal {
    public static void main(String[] args) {
        int n=5;
        int[][] triangle=new int[n][];
        for(int i=0;i<n;i++){
            triangle[i]=new int[i+1];
        }
        for(int i=0;i<n;i++){
            for(int spaces=0;spaces<n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    triangle[i][j]=1;
                    System.out.print(triangle[i][j]+" ");
                }
                else{
                    triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
                    System.out.print(triangle[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
