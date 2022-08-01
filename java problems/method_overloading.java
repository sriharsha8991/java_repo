package com.java1;

public class method_overloading {
    public static void main(String[] args) {
        // method overloading occurs when A method/function has same name but difference in parameters;

        // method overloading type1: same function name with different number of parameters of same data type.
        int adder = fun(4,5);
        System.out.println("adder: "+adder);
        int mul = fun(4,5,1);
        System.out.println("multiplier: "+mul);
        int add = add(54,5);
        System.out.println("add :"+add);
        String ad = add("sri","harsha");
        System.out.println("String Adder: "+ad);
        }// using Same function name with different parameters
        static int fun(int a,int b){
        return a+b;
    }
        static int fun(int a,int b,int c){
        return a*b*c;
        }
        // using Same function name with different parameters of different data types
        static int add(int p,int q){
        return p+q;
        }
        static String add(String p, String q){
        return p+q;
        }
}
