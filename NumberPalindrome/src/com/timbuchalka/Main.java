package com.timbuchalka;

public class Main {

    public static void main(String[] args){

    }

    public static boolean isPalindrome (int number) {
        if (number < 10) {
            return false;
        }

        int original = number;
        int reverse = 0;

        while(number > 0) {

            int remainder = number %  10;
            reverse = number * 10 + remainder;
            original /= 10;
        }

        return original == reverse;

    }
}
