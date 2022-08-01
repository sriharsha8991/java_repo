package com.java1;

import java.util.Scanner;

public class function {
    // creating a sum function.
    public static void main(String[] args) {
        System.out.println("Creating Sum function");
        System.out.println( );
        System.out.println("how many times your function need to be repeated: ");
        Scanner in = new Scanner(System.in);
        int iter = in.nextInt();
        for(int i =1; i<=iter;i++){
            sum();
        }

    }// Function without return type..
    static void sum(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("your Sum : "+ sum);

    }
}
