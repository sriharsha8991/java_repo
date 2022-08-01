package com.java1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows in the array: ");
        int rows = in.nextInt();
        System.out.print("Enter no. of columns: ");
        int colum = in.nextInt();
        //Initialisation of 2d array
        int[][] arr = new int[rows][colum];
        // inputing elements inside 2d array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <colum ; col++) {
                arr[row][col] = in.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int[] num:arr){

            System.out.println(Arrays.toString(num));

        }
    }
}
