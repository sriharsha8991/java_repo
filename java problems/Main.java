package com.java1;

import java.util.Scanner;

public class Main {
        // Basic revision.
    public static void main(String[] args) {
	// write your code here REvising the concept
        // using print statement
        System.out.println("Hello babe");
        //Using Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Take an integer input from the user ");
        int num = in.nextInt();
        int fun = odd(num);
        System.out.println(fun);
        System.out.println("Take a String input from user");
        String word = in.next();
        // using method

        new_method();
    }
    static void new_method(){
        System.out.println("Created a new mewthod of void type that will not return anything");
    }
    // creating a return type function
    static int odd(int numb){
        if (numb%2 == 0){
            System.out.println("even");
            return 1*numb;
        }else{
            return 0;
        }

    }
}
