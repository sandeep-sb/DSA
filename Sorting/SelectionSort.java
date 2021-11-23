package com.Sandeep;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i=0; i<arr.length; i++){
            // find maximum element
            int last = arr.length - i - 1;
            int maxIndexEle = findMax(arr,0, last);

            //swap the maximum element with its correct index element
            swap(arr, maxIndexEle, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMax(int[] arr,int start, int last) {
        int max = start;
        for (int i = start; i<=last; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
