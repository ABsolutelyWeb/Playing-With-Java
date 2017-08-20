package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

// Autoboxing is essentially taking a primitive and turning it into an object or class type. For
// example, turning int into Integer.
public class Main {

    public static void main(String[] args) {
        // Allocate string array of size 10
        String[] stringArray = new String[10];

        // Allocate int array of size 10
        int[] intArray = new int[10];

        // Allocate a String ArrayList
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Blah");

        // Allocate an int ArrayList
        // Will NOT work since int is a primitive and primitives aren't classes.
//        ArrayList<int> intArrayList = new ArrayList<int>();
//        intArrayList.add(1);

        // This can be fixed by making an IntClass
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(2));

        // This is messy. There has to be an easier way of doing this.
        // So we use the concept of autoboxing.

        // The difference between int and Integer is that Integer is a
        // class.
        Integer integer = new Integer(2);

        // Same with double and Double
        Double doub = new Double(2.3);

        ArrayList<Integer> integ = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            // Find the value of i as an int and then converting it
            // into the Integer class.
            integ.add(Integer.valueOf(i));
            // Converts Integer class back to int type.
            System.out.println(i + " ---> " + integ.get(i).intValue());
        }

        // Instead of Integer myInt = Integer.valueOf(50), we can do:
        Integer myInt = 50; // This is autoboxing. At compile time, the 50 is Integer.valueOf(50)
        int myInt2 = myInt.intValue(); // Unboxing
    }
}
