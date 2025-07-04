package Recursion.Backtracking;
public class N_Queens {
    public static void main(String[] args) {
        int n=5;
        boolean[][] maze=new boolean[n][n];
        System.out.println(print_NQueens(maze,0));
    }
    static int print_NQueens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            //check the queen is safe or not
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count += print_NQueens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for(boolean[] arr:board){
            for(boolean ele:arr){
                if(ele){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board,int r,int c){
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }
        int n=Math.min(r,(board.length-c-1));
        for(int i=1;i<=n;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        int max_left=Math.min(r,c);
        for(int i=1;i<=max_left;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        return true;
    }
}
