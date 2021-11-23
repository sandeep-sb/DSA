package com.Sandeep;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion(int[] arr){
        // i<arr.length-1 means that loop goes from 0 till arr.length-2 th element
        // in order to prevent ArrayIndexOutOfBounds Exception
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
