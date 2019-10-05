package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count ++;
//        }
//
//        // The following for loop bellow is not the same as the while above!
//
////        for(int i=1; i<7; i++) {
////                System.out.println("Count value is " + count);
////        }
//
//        // The following for loop below will be the same as the while loop.
//
//        System.out.println("*******************************");
//
////        for(count = 1; count!=6; count++) {
////            System.out.println("Count value is " + count);
////        }
////
////        while(true) {
////            if(count ==6){
////                break;
////            }
////            System.out.println("Count value is "+ count);
////        }
//
//        System.out.println("*******************************");
//
//        count = 1;
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count <100) {
//                break;
//            }
//        } while(count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.printf(" Even number " + number);
//        }


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.printf(" Even number " + number);

            evenNumbersFound ++;
            if(evenNumbersFound >= 5) {
                break;
            }


        }
        System.out.println(" Total Even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
