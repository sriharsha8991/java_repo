package com.java1;

import java.util.Scanner;
import java.util.Arrays;

public class Basic_arrays {
    public static void main(String[] args) {
        System.out.println("Basic Array programs");
        // declarations and intialization of Arrays
        int array[] = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i< array.length;i++){
            System.out.println("give the input num "+i);
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
        //
    }
}






