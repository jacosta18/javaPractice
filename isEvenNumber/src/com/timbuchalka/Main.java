package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(45));

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            evenNumbersFound ++;
            System.out.printf(" Even number " + number);

        }
        System.out.println("Total Even numbers found = " + evenNumbersFound);

    }


    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



}
