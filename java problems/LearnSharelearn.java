package com.java1;

public class LearnSharelearn {
    public static void main(String[] args) {
        String input = "LearnShareLearn";
        int index = input.indexOf("ea");
        System.out.println("index: " + index);   // Returning position of 1st occurence of given character of specified character.
        int n_index = input.indexOf("ea",3);
        System.out.println("int index of :"+n_index);  //this method returns the index position for the given substring and from index
        int l_index = input.lastIndexOf("ea");
        System.out.println("last index: "+l_index);  //lastIndexOf() method returns the last index of the given character value or substring
    }
}
