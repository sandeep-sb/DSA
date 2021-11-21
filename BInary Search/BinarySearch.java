package com.company;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        int target = 89;
        int ans = BinSearch(arr, target);
        System.out.println(ans);

    }

    static public int BinSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]>target){
                end = mid - 1;
            }
            else if (arr[mid]<target){
                start = mid + 1;
            }
            else if (arr[mid] == target)
                return mid;
        }

        // In case no element is found
        return -1;
    }

}
