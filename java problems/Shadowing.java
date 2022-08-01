package com.java1;

public class Shadowing {
    static int x = 90;// the value of x is shadowed in line 8

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;// using the concept of shadowing!!!!
        System.out.println(x);
        fun();

    }
     static void fun() {
         System.out.println(x);
    }

}
