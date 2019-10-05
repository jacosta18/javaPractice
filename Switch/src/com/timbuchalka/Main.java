package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//            if(value == 1) {
//                System.out.printf("Value was 1");
//            } else if (value == 2){
//                System.out.println("Value was 2");
//            } else {
//                System.out.println("Was not 1 or 2");
//            }

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("Actually it was a switch value " + switchValue);
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        char character = 'G';

        switch(character) {
            case 'A':
                System.out.println("Character was A");
                break;

            case 'B':
                System.out.println("Character was B");
                break;

            case 'C':
                System.out.println("Character was C");
                break;

            case 'D': case 'E': case 'F':
                System.out.println("Character was D, E and F");
                break;

            default:
                System.out.println("Character was not A, B, C, D, E or F");
                break;
        }

        String month = "JuNe";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.printf("Not sure");
                break;
        }
    }

    private static void printDayOfTheWeek(int day) {

        int switchDayValue = 6;

        switch (switchDayValue) {
            case 0:
                System.out.println("Monday");
                break;

            case 1:
                System.out.println("Tuesday");
                break;

            case 2:
                System.out.println("Wednesday");
                break;

            case 3:
                System.out.println("Thursday");
                break;

            case 4:
                System.out.println("Friday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
                break;

        }

    }

}
