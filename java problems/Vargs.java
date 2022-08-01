package com.java1;

import java.util.Arrays;

public class Vargs {
    public static void main(String[] args) {
        // Variable length arguments in methods
        System.out.println("printing variable length arguments;");
        vargs(2,5,4,8,96,3,4);
        // we can also print combination of variable length arguments and keyword arguments
        vikings(2,54,6,896,65,6);
    }

    static void vikings(int a,int b, int c,int ...v) {
        System.out.println(Arrays.asList(a,b,c,v));
        
        
    }

    static void vargs(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
