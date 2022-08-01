package com.java1;

import java.util.Scanner;

public class avg_of_diagnols {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] mat = new int[3][3];
        int sum = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = in.nextInt();
                //System.out.println(mat[i][j]+'\t');
            }
            //System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                     sum = sum +mat[i][j];
                }

            }
        }
        System.out.println("Average of diagnol elements :"+sum/3);
    }
}
