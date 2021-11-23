package com.Sandeep;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            boolean swapped = false;
            // Here the loop runs for length-i times, because we don't want to iterate over sorted elements
            // And the greatest elements are sorted from back, so we reduce the iteration number.
            for (int j=1; j<arr.length-i; j++){
                if (arr[j]<arr[j-1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
