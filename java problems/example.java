package com.java1;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        System.out.println("what is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("your name is "+ name);

    }
}
