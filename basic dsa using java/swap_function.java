package com.java1;

import java.util.Arrays;
import java.util.Scanner;

public class swap_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <size ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array, int index1,int index2 ){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
