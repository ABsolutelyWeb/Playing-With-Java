package com.company;


// Switch statements and different types of while
public class Main {

    public static void main(String[] args) {
		boolean x = true;
		int y = 4;

//		while (x) {
//			switch (y) {
//				case 1:
//					System.out.println("We got 1.");
//					break;
//				case 2:
//					System.out.println("We got 2.");
//					break;
//				case 3:
//					System.out.println("We got 3.");
//					break;
//				default:
//					System.out.println("Exiting...");
//					x = false;
//					break;
//			}
//			return;
//		}


		// All combinations for two dice.
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {7, 8, 9, 10, 11, 12};
		int a = 1;

		// With regular for statement
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.println(array[i] + " " + array[j]);
//			}
//		}

//		// With for each
//		for (int i : array) {
//			for (int j : array) {
//				System.out.println(i + " " + j);
//			}
//		}
//		// Parallel iteration
//		for (int i = 0, j = 0; i < array.length && j < array2.length; i++, j++) {
//			System.out.println(array[i] + " " + array2[j]);
//		}

	}
	int x1 = 10;
	public void go(int a) {
		int x1 = 0;  // local x1 shadows original, class-level x1
		x1++;        // increments local x1
		this.x1++;   // references the class level variable x1
	}
}
