package Recursion.Backtracking;
import java.util.*;
public class Allpaths {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        all_directions("",maze,0,0);
        int[][] path=new int[maze.length][maze.length];
        all_paths_print("", maze, 0, 0, path, 1);
    }
    static void all_directions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            all_directions(p+"D", maze, r+1, c);
        }
        if(c<maze[0].length-1){
            all_directions(p+"R", maze, r, c+1);
        }
        if(c>0){
            all_directions(p+"L", maze, r, c-1);
        }
        if(r>0){
            all_directions(p+"U", maze, r-1, c);
        }
        maze[r][c]=true;
    }
    static void all_paths_print(String p,boolean[][] maze,int r,int c,int[][] path,int count){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.println(p);
            path[r][c]=count;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=count;
        if(r<maze.length-1){
            all_paths_print(p+"D", maze, r+1, c,path,count+1);
        }
        if(c<maze[0].length-1){
            all_paths_print(p+"R", maze, r, c+1,path,count+1);
        }
        if(c>0){
            all_paths_print(p+"L", maze, r, c-1,path,count+1);
        }
        if(r>0){
            all_paths_print(p+"U", maze, r-1, c,path,count+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
