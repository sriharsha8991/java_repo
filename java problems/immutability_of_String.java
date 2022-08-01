package com.java1;

public class immutability_of_String {
    public static void main(String[] args) {
        // String immutability.
        String name = "Sri";
        name.concat("harsha");
        name = "Ravan";
        System.out.println(name); // output is only "Sri" because Strings are immutable

        // String Buffer
        StringBuffer nam = new StringBuffer("oyee");
        nam = new StringBuffer("Rebel's");
        nam.append("   mirchi");
        System.out.println(nam);// String Buffer is mutable  each
        //  method in StringBuffer is synchronized that is StringBuffer is thread safe .

    }
}
