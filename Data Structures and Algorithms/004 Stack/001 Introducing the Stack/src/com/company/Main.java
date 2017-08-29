package com.company;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(5);

        // Testing our stack data structure
//        myStack.push('9');
//        myStack.push('5');
//        myStack.push('3');
//        myStack.push('2');
//        myStack.push('1');
//        myStack.push('1');
//
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peak());
//
//        myStack.push('8');
//        System.out.println(myStack.peak());

//        System.out.println("========================================================\n");

        // How to loop through stack to get all values.
//        while(!myStack.isEmpty()) {
//            char val = myStack.pop();
//            System.out.println(val);
//        }

        reverseString("world");
        reverseString("blah");

    }

    // Use stack to reverse a string.
    public static String reverseString(String str) {
        Stack revStack = new Stack(str.length());
        char[] charRev = str.toCharArray();

        for(int i = 0; i < charRev.length; i++) {
            revStack.push(charRev[i]);
        }

        String buildStr = "";
        while(!revStack.isEmpty()) {
            char val = revStack.pop();
            System.out.print(val);
            buildStr += val;
        }
        System.out.println("");

        return buildStr;
    }
}
