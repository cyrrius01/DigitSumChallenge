package com.company;

import sun.security.util.Length;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(875));
        System.out.println(sumDigits(900));
        System.out.println(sumDigits(32));
        System.out.println(sumDigits(-32));

    }


    public static int sumDigits(int number){

        if(number < 10) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            // extract least significant digit
            int digit = number % 10;
            sum += digit;

            // drop least significant digit
            number /= 10;
        }

        return sum;

    }
}
