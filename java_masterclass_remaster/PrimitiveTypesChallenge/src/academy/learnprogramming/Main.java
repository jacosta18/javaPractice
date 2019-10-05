package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 60;

        short myShortValue = 1500;

        int myIntValue = 350200;

        long myLongLiterateValue = 5000L + 10L * (myByteValue + myIntValue + myShortValue);
        System.out.println(myLongLiterateValue);

    }
}
