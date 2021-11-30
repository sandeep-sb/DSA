package com.Sandeep;

public class MagicNumber {
    public static void main(String[] args) {
        int num = 15;
        int base = 5;
        int lastDigit = -1;
        int ans = 0;

        while(num != 0){
            lastDigit = num & 1;
            ans += lastDigit * base;
            base = base * 5;
            num = num >> 1;
        }
        System.out.println(ans);
    }

}
