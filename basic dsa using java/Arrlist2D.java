package com.java1;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrlist2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 2D Array list initialisation
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
        // Adding elements to each arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }

        }
        System.out.println(arr);
    }
}
