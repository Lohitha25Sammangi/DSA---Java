package arrays;

import java.util.*;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        int[][] arr = {
                {1, 2, 3}, // 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
        };

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        int[][] arr1 = new int[3][3];
        for (int row = 0; row < arr1.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = in.nextInt();
            }
        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
    }
}
