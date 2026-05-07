package com.self.leetcode;

import java.util.HashSet;
import java.util.Set;

public class duplicateInArray {
    public static void main(String[] args) {
        //find the duplicates in the array and print
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num:arr){
            // add() returns false if item already exists
            if(!seen.add(num)){
                result.add(num);
            }
        }

        System.out.println(result);

    }
}
