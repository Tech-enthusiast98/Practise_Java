package com.self.leetcode.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class moveAllZeroes {
    public static void main(String[] args) {
        //move all the zeros to right
        //{1,6,0,0,2,0,3,4}
        //{1,6,2,3,4,0,0,0}
        List<Integer> list = Arrays.asList(1, 6, 0, 0, 2, 0, 3, 4);

        List<Integer> result = Stream.concat(
                list.stream().filter(n -> n!=0),
                list.stream().filter(n -> n==0))
                .toList();

        System.out.println(result);
    }
}
