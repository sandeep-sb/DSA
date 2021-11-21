package com.company;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        // Matrix is sorted row-wise and column-wise
        int [][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(matrix, 55)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;                     // length of lower bound
        int col = matrix.length - 1;     // length of upper bound, i.e., number of columns
                                         // matrix.length == matrix[0].length

        while(row < matrix.length && col >= 0 ){
            if (target == matrix[row][col]){
                return new int[]{row, col};
            }
            if (target < matrix[row][col]){
                col--;
            }
            if (target > matrix[row][col]){
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
