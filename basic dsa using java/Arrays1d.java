package com.java1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int arrsize = in.nextInt();

        // Initialisation of 1d Array
        int[] arr1 = new int[arrsize];

        //taking elements as inputs for array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        // printing the array method1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        // method 2
        for (int elements : arr1){
            System.out.print(elements + " ");
        }

        // method 3
        System.out.println(Arrays.toString(arr1));

    }
}
