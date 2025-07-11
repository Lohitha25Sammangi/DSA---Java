package Recursion.Backtracking;
import java.util.*;
public class sudoku_solver {
    public static void main(String[] args) {
        int[][] board={
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solver(board)){
            display(board);
        }else{
            System.out.println("Sudoku is not solved");
        }
    }
    static boolean solver(int[][] board){
        int n=board.length;
        int row=-1,col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            if(emptyLeft==false){
                break;
            }
        }
        if(emptyLeft==true){
            return true;
        }
        for(int num=1;num<=9;num++){
            if(isSafe(board,row,col,num)){
                board[row][col]=num;
                if(solver(board)){
                    return true;
                }else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    static void display(int[][] board){
        for(int[] nums:board){
            System.out.println(Arrays.toString(nums));
        }
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int[] nums:board){
            if(nums[col]==num){
                return false;
            }
        }
        int n=(int)Math.sqrt(board.length);
        int r=row-(row%n);
        int c=col-(col%n);
        for(int i=r;i<(r+n);i++){
            for(int j=c;j<(c+n);j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
