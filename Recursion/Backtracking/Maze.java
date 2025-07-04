package Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //print_path("", 3, 3);
        //System.out.println(path_ret("", 3, 3));
        //System.out.println(path_diagonal("", 3, 3));
        boolean[][] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        print_path_obstacles("", maze, 0, 0);

    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static void print_path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            print_path(p+"D",r-1,c);
        }
        if(c>1){
            print_path(p+"R",r,c-1);
        }
    }
    static ArrayList<String> path_ret(String p,int r,int c){
        ArrayList<String> outer=new ArrayList<>();
        if(r==1 && c==1){
            outer.add(p);
            return outer;
        }
        if(r>1){
            outer.addAll(path_ret(p+"D",r-1,c));
        }
        if(c>1){
            outer.addAll(path_ret(p+"R",r,c-1));
        }
        return outer;
    }
    static ArrayList<String> path_diagonal(String p,int r,int c){
        ArrayList<String> outer=new ArrayList<>();
        if(r==1 && c==1){
            outer.add(p);
            return outer;
        }
        if(r>1 && c>1){
            outer.addAll(path_ret(p+"D",r-1,c-1));
        }
        if(r>1){
            outer.addAll(path_ret(p+"D",r-1,c));
        }
        if(c>1){
            outer.addAll(path_ret(p+"R",r,c-1));
        }
        return outer;
    }
    static void print_path_obstacles(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            print_path_obstacles(p+"D",maze,r+1,c);
        }
        if(c<maze.length-1){
            print_path_obstacles(p+"R",maze,r,c+1);
        }
    }
}
