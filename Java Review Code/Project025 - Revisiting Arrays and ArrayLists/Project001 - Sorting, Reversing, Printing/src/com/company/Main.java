package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        printArray(sortArrayASC(getArray()));
//        printArray(sortArrayDESC(getArray()));
        printArray(reverseArray(getArray()));
    }




    public static int[] sortArrayASC(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order: ");
        return array;
    }



    public static int[] reverseArray(int[] array) {

        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] sortArrayDESC(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in descending order: ");
        return array;
    }





    public static int[] getArray() {
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        if(arraySize <=0) {
            System.out.println("Array size cannot be less than or equal to 0. Array defaulted to 1.");
            arraySize = 1;
        }
        int[] array2 = new int[arraySize];

        System.out.println("Enter " + arraySize + " integer elements: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element #" + (i+1) + "\n");
            array2[i] = scanner.nextInt();
        }
        return array2;

    }



    public static int[] printArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            if (i == 0 && array.length > 1) {
                System.out.print("[" + array[i] + ", ");

            } else if (array.length == 1) {
                System.out.println("[" + array[i] + "]");

            } else if (i == array.length-1) {
                System.out.println(array[i] + "]");

            } else {
                System.out.print(array[i] + ", ");
            }
        }

        return array;
    }
}
