package com.company;

public class CeilingQuestion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 78;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    static public int Ceiling(int[] arr, int target) {

        // Array index out of bounds
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}


//public class CeilingQuestion {
//    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,16,18};
//        int target = 15;
//        int ans = Ceiling(arr, target);
//        System.out.println(ans);
//
//    }
//    static public int Ceiling(int[] arr, int target){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//
//            if (arr[mid] == target){
//                return arr[mid];
//            }
//
//            if (arr[mid] > target){
//                end = mid - 1;
//            }
//            else if (arr[mid] < target){
//                start = mid + 1;
//            }
//
//            if (start == end){
//                if (arr[start]<target)
//                    try {
//                        return arr[start + 1];
//                    }
//                catch (ArrayIndexOutOfBoundsException e){
//                    System.out.println("Element has no ceil in the array");
//                }
//                else return arr[start];
//            }
//        }
//        return -1;
//    }
//}
