package com.company;

public class Main {
    public static void main(String[] args) {

        // Same as proj 5, but with while loop.
        int count = 0;
        int start = 20;
        int end = 50;
        while (start <= end) {
            if (isEven(start)) {
                count++;
                start++;
                // From the range, count only the first 6 even numbers.
                if (count == 6) {
                    System.out.println("There are " + count + " even numbers.");
                    break;
                }
            } else {
                start++;
            }
        }
    }

    // Is the number even?
    public static boolean isEven(int num) {
        if ( (num > 0) && (num%2 == 0) ) {
            System.out.println(num);
            return true;
        }
        //System.out.println(num);
        return false;
    }
}
