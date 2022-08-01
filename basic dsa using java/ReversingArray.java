package com.java1;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {11,22,55,44,88,19,778,3,8,1};
        int start = 0;

        int end = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        int[] ans = reverse(arr,start,end);
        System.out.println(Arrays.toString(ans));
        //System.out.println(Arrays.toString(arr));

    }
    // Reversing an array using 2 pointer method

    static int[] reverse(int[] ar, int start, int end){
        while(end>start){
            swap(ar, start, end);
            start++;
            end--;
        }
        return ar;
    }

    static void swap(int[] array, int index1,int index2 ){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
