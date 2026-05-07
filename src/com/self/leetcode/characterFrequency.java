package com.self.leetcode;

import java.util.HashMap;
import java.util.Map;

public class characterFrequency {
    public static void main(String[] args) {
        //Print the count of all characters
        // {a=1, c=1, t=1, g=1, i=1, z=1, n=2, o=1}
        String str = "cognizant";

        Map<Character,Integer> res = new HashMap<>();
        for(char c:str.toCharArray()){
            res.put(c, res.getOrDefault(c,0)+1);
        }

        System.out.println(res);

    }
}
