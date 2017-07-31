package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // TEST VALUES ===================================================
//        int[] myInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] myOtherInt = {};

//        printDivisibility(myOtherInt, 2);
//        printDivisibility(myInt, 0);
//        printDivisibility(myInt, 2);
//        printDivisibility(myInt, 3);
//        printDivisibility(myInt, 4);
//        printDivisibility(myInt, 5);
//        printDivisibility(myInt, -6);
//        printDivisibility(myInt, 12);

//        printDivisibility(getArray(7), 2);
//        printDivisibility(getArray(0), 2);
        // TEST VALUES END ==============================================


        printDivisibility(getArray(), chooseMod());
//        getAverage(getArray());
    }

    // getArray() first asks you how big the array should be. Then depending on
    // what you entered, you will have to enter in that many integers. The method
    // returns the number of entered integers as an array.
    public static int[] getArray() {

        // Initially ask the user how big the array should be.
        System.out.print("Enter array length: ");
        int args = scanner.nextInt();

        // If the user enters an array length that is less than or is 0, the
        // array length defaults to 1.
        if (args <= 0) {
            System.out.println("You cannot enter 0 or less!");
            args = 1;
        }

        System.out.println("Enter " + args + " integer values. Enter each one by one followed by the 'Enter' key.");
        System.out.println(" ");

        // Initialize an array of the user specified length.
        int[] values = new int[args];

        // For each index of the values array, ask the user for an input.
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value #" + (i+1) + ": ");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // chooseMod() method asks for an integer input and then returns
    // that number.
    public static int chooseMod() {
        System.out.print("Choose mod value: ");
        int mod = scanner.nextInt();
        return mod;
    }

    // Pass in an array variable and see how many elements
    // are divisible by the given mod integer.
    public static void printDivisibility(int[] intArray, int mod) {

        // mod argument must not be zero.
        if (mod == 0) {
            System.out.println("FAILURE: Cannot mod by zero!");
            return;
        }

        // array argument cannot be empty.
        if (intArray.length < 1) {
            System.out.println("FAILURE: Cannot pass in an empty array!");
            return;
        }

        System.out.println(" ");
        System.out.println("Here are all numbers in the array that are divisible by " + mod + ":");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % mod == 0) {
                System.out.println(intArray[i]);
            }
        }
    }

    public static double getAverage(int[] array) {
        double average = 0;
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        average = total / array.length;
        System.out.println("The average is " + average);
        return average;
    }
}
