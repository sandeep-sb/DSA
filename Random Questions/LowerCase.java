package com.Sandeep;

class LowerCase {
    public static void main(String[] args) {

        System.out.println(toLowerCase("LOVELY"));
    }
    static String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch: s.toCharArray()){
            if (ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }
            str.append(ch);
        }
        return str.toString();
    }
}
