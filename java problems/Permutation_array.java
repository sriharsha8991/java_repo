package com.java1;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[6];
        for (int i =0;i<nums.length;i++){
            nums[i] = in.nextInt();
           int new_pos = nums[i];

        }
       // System.out.println(Arrays.toString(nums));
        //System.out.println(nums[]);
        int [] ans = new int[nums.length];
        System.out.println(Arrays.toString(nums));
        for (int k = 0;k<nums.length;k++){
           ans[k] = nums[nums[k]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
