package com.company;

public class Main {
    public static void main(String[] args) {

//        int switchVal = 1;
//        switch (switchVal) {
//            case 1:
//                System.out.println("Value is 1.");
//                break;
//            case 2:
//                System.out.println("Value is 2.");
//                break;
//            default:
//                System.out.println("Invalid value.");
//                break;
//        }

//        for (double i = 10; i >= 1; i--) {
//            System.out.println( "Calculated interest for $10k at " + i + "% interest is " + String.format("%.2f", calcInterest(10000, i)) );
//        }

        // Find all prime numbers from 1 to 20, but stop once 5
        // primes have been found.
        int count = 0;
        for (int j = 1; j <= 20; j++) {
            if (prime(j)) {
                count++;
                if (count==8) {
                    break;
                }
            }
        }
    }

//    public static double calcInterest(double amount, double rate) {
//        return (amount*(rate/100));
//    }

    public static boolean prime(int num) {
        if (num == 1) {
            // System.out.println(num + " is NOT prime.");
            return false;
        }

        // Square root num to reduce computing time.
        for (int i = 2; i <= (long) Math.sqrt(num); i++) {
            if ((num % i) == 0) {
                // System.out.println(num + " is NOT prime.");
                return false;
            }
        }

        System.out.println(num + " IS prime.");
        return true;
    }
}