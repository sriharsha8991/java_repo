package com.java1;

public class String_program {
    public static void main(String[] args) {
        // Appending A character sequence..
        StringBuffer name = new StringBuffer("Sri");
        System.out.println(name);
        name.append("Harsha");
        System.out.println(name);
        //inserting another String from a particular index.
        name.insert(2,"Ravan");
        System.out.println(name);
        //Replace a string part from index 3 to 5 and put a string in that location.
        name.replace(3,5,"Radhe");
        System.out.println(name);
        //Reverse a given string named “Hello World”.
        name.reverse();
        System.out.println(name);

    }
}
