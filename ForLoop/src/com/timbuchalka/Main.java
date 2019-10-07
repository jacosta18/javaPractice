package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));

        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }

        System.out.println("*************************");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }

        int count = 0;
        for(int i=2; i<50; i++) {
            if(inPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }

            }
        }
    }


    private static boolean inPrime(int n){
        if(n == 1) {
            return false;
        }

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate/100);
    }
}
