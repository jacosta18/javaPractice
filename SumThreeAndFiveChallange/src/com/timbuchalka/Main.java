package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// Create a for statement using a range of numbers from 1 to 1000 inclusive

        int count = 0;
        int sum = 0;

        for(int number=1; number<1001; number++){
            if((number % 3 == 0) || (number % 5 == 0)) {
                count++;
                sum += number;
                System.out.println("Found number = " + number);
            }

            if(count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
