package com.java1;

import java.util.Scanner;

public class String_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("String Example");
        String g = greet();
        System.out.println(g);
        System.out.println("Say YES or NO!!!!!! ");


    }
    // Creating String Return Type Function
    static String greet(){
        String gret = "Do you have a Girl friend?";
        return gret;
    }
}
