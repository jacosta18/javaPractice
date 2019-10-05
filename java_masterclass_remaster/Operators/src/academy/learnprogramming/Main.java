package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 3; // 1 + 2 = 3
        System.out.println("1+2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;  // 2 * 10 = 20
        System.out.printf("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.printf("20 / 5 = " + result);

        result = result % 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2 = 3
        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -=2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
        }

        int topscore = 80;
        if (topscore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topscore > secondTopScore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topscore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true instead of using one = sign");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;  // ternary operator shortcut to assigning one or two variables depending on the condition.
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double TotalValue = (firstValue + secondValue) * 100d;
        System.out.println("The total value of the sum is = " + TotalValue);

        TotalValue = TotalValue % 40.00;
        System.out.printf("The remainder of TotalValue and 40 is = " + TotalValue);

        boolean isNoRemainder = (TotalValue == 0);
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
