package com.Sandeep;

//number of digits in base b of number n is ??

public class NoOfDigits {
    public static void main(String[] args) {
        int num = 31;
        System.out.println(byformula(num, 2));
        System.out.println(byShiftOperator(num));
    }

    private static int byformula(int n, int base) {
        int ans = (int)(Math.log(n) / Math.log(base)) + 1;
        return ans;
    }

    private static int byShiftOperator(int n) {
        int i=0;
        while(n > 0){
            n = n >> 1;
            i++;
        }
        return i;
    }
}
