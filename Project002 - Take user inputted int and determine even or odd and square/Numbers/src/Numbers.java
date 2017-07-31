// Numbers

import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a whole number: ");
            String input = sc.next();

            try {
                int n = Integer.parseInt(input);
                System.out.println("Your number is: " + n);

                if (n % 2 == 0) {
                    System.out.println(n + " is also even.");
                } else {
                    System.out.println(n + " is also odd.");
                }

                System.out.println("The square of " + n + " is " + n * n + ".");
                break;

            } catch (NumberFormatException ne) {
                System.out.println("You didn't enter a number! Try again. ");
                System.out.println(" ");
            }
        }

// GOING OVER bytes, shorts, ints, and longs
//        byte myByte = 127;
//        short myShort = 32767;
//        int myInt = 32;
//        long myLong = (long) (50000 + 10*(myByte + myInt + myShort));
//        System.out.println("myLong value is: " + myLong);

// GOING OVER DOUBLES
//        double kilo = 0.45359237;
//        int pounds = 200;
//        double poundsToKilo = (pounds*kilo);
//        System.out.println(poundsToKilo);

// GOING OVER CHAR AND BOOLEAN
// char myChar = '\u009'; <=== UNICODE OUTPUT


    }

}

// SAMPLE OUTPUT OF MAIN PROGRAM:

//Enter a whole number: stgs
//You didn't enter a number! Try again.
//
//Enter a whole number: 6.u
//You didn't enter a number! Try again.
//
//Enter a whole number: 90
//Your number is: 90
//90 is also even.
//The square of 90 is 8100.
