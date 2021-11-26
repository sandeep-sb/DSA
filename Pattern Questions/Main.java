package com.Sandeep;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        pattern1(5);
//        pattern2(5);
//        pattern17(5);
        pattern31(4);
    }

    static void pattern31(int n){
        for (int row=1; row<2*n; row++){
            for(int col=1; col<2*n; col++){
                int atEveryIndex = n+1 - Math.min(Math.min(row, col ), Math.min(2*n - col, 2*n - row));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row=1; row<=2*n-1; row++){
            int c = row<=n ? row : 2*n - row;

            // for every row, print the spaces
            for( int spaces=1; spaces<=n-c; spaces++){
                System.out.print(" ");
            }

            // for every row, run the column
            for(int col1=c; col1>=1; col1--){
                System.out.print(col1);
            }

            for (int col2=2; col2<=c; col2++){
                System.out.print(col2);
            }
            // After every row, change the line
            System.out.println();

        }
    }

    static void pattern30(int n){
        for (int row=1; row<=n; row++){

            // for every row, print the spaces
            int spaces = n - row;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            // for every row, run the column
            for (int col1=row; col1>=1; col1--){
                System.out.print(col1);
            }
            for (int col2=2; col2<=row; col2++){
                System.out.print(col2);
            }
            // After every row, change the line
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row=1; row <= 2*n-1; row++){
            int totalColsInRow = row <= n ? row : 2*n - row;
            int spaces = n - totalColsInRow;

            // for every row, print the spaces
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }

            // for every row, run the column
            for (int col = 1; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            // After every row, change the line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n - 1; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
            // for every row, run the column
            for (int col=1; col <= totalColsInRow; col++){
                System.out.print("*");
            }
            // After every row, change the line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row=1; row<=n; row++){
            // for every row, run the column
            for (int col=1; col <= row; col++){
                System.out.print(col + " ");
            }
            // After every row, change the line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row=1; row<=n; row++){
            // for every row, run the column
            for (int col=1; col <= n+1-row; col++){
                System.out.print("*");
            }
            // After every row, change the line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            // for every row, run the column
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            // After every row, change the line
            System.out.println();
        }
    }

     static void pattern1(int n){
        for (int row=1; row<=n; row++){
            // for every row, run the column
            for (int col=1; col<=n; col++){
                System.out.print("*");
            }
            // After every row, change the line
            System.out.println();
        }
     }
}
