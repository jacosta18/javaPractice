package com.timbuchalka;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true){
            double order = counter + 1;
            System.out.println("Enter number " + order + ":");
            boolean isAnInt = scanner.hasNextDouble();
            if(isAnInt) {
                double number = scanner.nextDouble();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();  // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();





    }


}
