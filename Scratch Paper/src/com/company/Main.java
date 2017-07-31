package com.company;

public class Main {

    public static void main(String[] args) {
	    doubleLoop2(17);
    }

    // O (N * N/2) or O(N^2)
    public static void tooLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > n/2; j--) {
                System.out.println("Value of i is " + i + " and j is " + j);
            }
            System.out.println(" ");
        }
    }

    // O (log N)
    public static void doubleLoop(int n) {
        for (int i = 1; i < n;) {
            System.out.println("Value of i is " + i);
            i=i*2;
        }
    }

        public static void doubleLoop2(int n) {
        for (int i = n; i > 0;) {
            System.out.println("Value of i is " + i);
            i=i/2;
        }
    }


}
