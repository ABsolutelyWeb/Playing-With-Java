package com.company;

// REVISITING 2D AND 3D ARRAYS
public class Main {
    public static void main(String[] args) {
//        int[][] bigFat = new int[4][2];
        int[][]myArray = new int[][]{
                                        {9, 11},
                                        {2, 5},
                                        {4, 4},
                                        {6, 13}
                                    };
//        System.out.println(myArray[3][0]);

        // ARRAY with irregular rows
        int[][] myArray2 = new int[2][];
        myArray2[0] = new int[5]; // 1st row will have 5 columns
        myArray2[1] = new int[2]; // 2nd row will have 2 columns
//        System.out.println(myArray.length + " and " + myArray2.length); // Returns number of columns
//        System.out.println(myArray[0].length); // Return length of a specific column


        // 3D ARRAYS
        int[][][] myArray3 = new int[4][4][4];
        myArray3[0][3][1] = 850;

        //OR

        int[][][] unitsSold = new int[][][]{
                { // New York
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,850,0,0}// Apr
                },
                { // San Francisco
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,0,0,0}  // Apr
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                }
        };

        // Pass by value vs reference. Important LECTURE 34
//        int id = 1000;
//    id = updateId(id);
//    System.out.println(id);



        // VARARGS - variable length arguments
        // SYNTAX: 3 dots following parameter type. e.g. foo(boolean flag, int... items)
        // INVOCATION foo(true, new int[]{1,2,3})  <-- array of any size.
        //       comma-separated argsL foo(true,1,2,3,4,5,6,7,78,8)
        //       similarly, you can do foo(true) where an empty array gets passed.
    }

    public  static void arrFormat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");

            } else if (i == arr.length-1) {
                System.out.println(arr[i] + "]");

            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    // TESTING
    public static int updateId(int newId) {
        newId = 1001;
        return newId;
    }
}