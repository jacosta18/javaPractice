package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    private static void printYearsAndDays(long minutes){

        // 1 hour = 60 minutes  1 day = 24 hours = 1,440 minutes
        // 365 days = (365 * 1440) = 525600 minutes in a year

        if((minutes < 0)) {
            System.out.println("Invalid Value");
        }

        else {

            long days = (minutes / 1440);
            long years = days / 365;
            long remainderDays = days % 365;

            System.out.println(minutes + " min = " + years + " y " + remainderDays + "m");
        }
    }
}
