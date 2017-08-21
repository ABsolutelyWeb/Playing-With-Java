package com.company;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(5);

        myStack.push('9');
        myStack.push('5');
        myStack.push('3');
        myStack.push('2');
        myStack.push('1');
        myStack.push('1');

        System.out.println(myStack.pop());
        System.out.println(myStack.peak());

        myStack.push('8');
        System.out.println(myStack.peak());

        System.out.println("========================================================\n");

        // How to loop through stack to get all values.
        while(!myStack.isEmpty()) {
            char val = myStack.pop();
            System.out.println(val);
        }

    }

    // Use stack to reverse a string.
    public static String reverseString(String str) {
        return str;
    }
}
