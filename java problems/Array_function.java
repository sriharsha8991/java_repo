package com.java1;

import java.util.Arrays;

public class Array_function {
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,6,8};
        System.out.println(Arrays.toString(arr));
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changearr(int arr[]) {
        arr[0] = 99;
    }
}
