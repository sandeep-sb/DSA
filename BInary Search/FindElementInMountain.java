package com.company;

// https://leetcode.com/problems/find-in-mountain-array/


public class FindElementInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3,2,1};
        int target = 3;
        int targetIndex = MountainPeak(arr);
        int ansIndex = BinarySearch(arr, 0, targetIndex, target);
        if (ansIndex == -1){
            ansIndex = BinarySearch(arr, targetIndex + 1, arr.length-1, target);
        }
        System.out.println(ansIndex);
    }

    static public int MountainPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static public int BinarySearch(int[] arr, int start ,int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
