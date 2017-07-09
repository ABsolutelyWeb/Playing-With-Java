package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        sortArray(getArray());

    }



    // Returns on array based on user input.
    public static int[] getArray() {
        System.out.print("Enter the integer size of the array: ");
        int args = scanner.nextInt();

        // Array size must be greater than 0.
        if (args <= 0) {
            System.out.println("You cannot have an array less than or equal to zero. Default size of 1 assigned.");
            args = 1;
        }

        // Initialize array the given size of input.
        int[] values = new int[args];

        // Loop through each index. For each index, ask for input.
        // Return array.
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value #" + (i+1) + ": ");
            values[i] = scanner.nextInt();
        }
        return values;
    }



    // Takes in an array, spits out all array values and returns the array.
    public static int[] printArray (int[] array) {
        for (int i =0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }



    public static int[] sortArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++)
                if (array[i] > array[j]) {
                    int temp1 = array[i];
                    array[i] = array[j];
                    array[j] = temp1;
                }
        }
        printArray(array);
        return array;
    }

}
