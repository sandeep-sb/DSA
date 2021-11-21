package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        int target = 56;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static public int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAscending){
                if (arr[mid] > target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] < target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
