package com.java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialisation of Arraylist
        ArrayList<Integer> arr = new ArrayList<>(4);
        // inputing and adding elements to arraylist
        for (int i = 0; i < 9; i++) {
            arr.add(in.nextInt());
        }
        System.out.println(arr);
        System.out.println(arr.size());

    }
}
