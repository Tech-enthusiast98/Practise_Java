package com.self.leetcode.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateInArray {
    public static void main(String[] args) {
        //find the duplicates in the array and print
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};

        Set<Integer> result = new HashSet<>();

        Arrays.stream(arr)
                .filter(n -> !result.add(n))
                .forEach(System.out::println);
    }
}
