package com.timbuchalka;

//import sun.lwawt.macosx.CSystemTray;

//import javax.security.sasl.SaslClient;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNexInt = scanner.hasNextInt();

        if(hasNexInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();  // Handel the next line of code

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Hi " + name + ", you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("Unable to pass year of birth.");
        }

        scanner.close();
    }
}
