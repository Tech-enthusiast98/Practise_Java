package com.self.leetcode;

public class selectionSort {

    static void selectionSort(int[] arr) {
        int idx;
        for(int i=0;i<arr.length;i++) {
            idx=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[idx]){
                    idx=j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,0};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}