package com.self.leetcode;

public class moveAllZeroes {
    public static void main(String[] args) {
        //move all the zeros to right
        //{1,6,0,0,2,0,3,4}
        //{1,6,2,3,4,0,0,0}
        int[] nums= {1,6,0,0,2,0,3,4};
        int j = 0; // Pointer to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current element with the element at index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int i=0;i< nums.length;i++)
        System.out.println(nums[i]);
    }
}
