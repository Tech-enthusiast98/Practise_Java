package com.self.leetcode;

public class moveAllZeroes {
    public static void main(String[] args) {
        int[] nums= {1,4,0,0,2,0,3,};
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
