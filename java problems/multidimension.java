package com.java1;

import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        //int arr[][] = new int[3][3];
      //  int [][] arr = {
        //        {1,2,3},//0th index
          //      {4,5,6},//1st index
            //    {7,8,9}//2nd index
       // };
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        // input of array;
        for(int row = 0; row <arr.length; row++){
            // to get the number of rows
            for(int col = 0; col<arr[row].length; col++){
                // to get the number of elements columns
                arr[row][col] = in.nextInt();
            }

        }
        System.out.println("");


    }
}
