package com.Sandeep;

// If in an array, all the numbers occur twice but one number occur once, find that number
// [2,3,4,1,2,1,3,6,4]

public class NonDupicateNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,4,1,2,1,3,6,4};
        System.out.println(findDupicate(arr));
    }

    static int findDupicate(int[] arr){
        int ans = 0;
        for (int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
