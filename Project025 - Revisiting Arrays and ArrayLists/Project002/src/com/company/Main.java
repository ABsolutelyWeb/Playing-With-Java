package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean run = true;
        int choice = 0;
        printInstructions();
        while(run) {
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchForItem();
                    break;

                case 6:
                    run = false;
                    System.out.println("Bye");
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - Print choice options.");
        System.out.println("\t1 - Print list of items.");
        System.out.println("\t2 - Add an item.");
        System.out.println("\t3 - Modify an item.");
        System.out.println("\t4 - Remove an item.");
        System.out.println("\t5 - Search for an item.");
        System.out.println("\t6 - EXIT");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item to add: ");
        String additem = scanner.nextLine();
        groceryList.addGroceryItem(additem);
    }

    public static void modifyItem() {
        System.out.println("Please state which position you wish to modify:");
        int position = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What will be the new item?");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(position, newItem);
    }

    public static void removeItem() {
        System.out.println("State which position you wish to clear: ");
        int position = scanner.nextInt();
        groceryList.removeGroceryItem(position);
    }

    public static void searchForItem() {
        System.out.println("What are you trying to find?: ");
        String search = scanner.nextLine();

        System.out.println("'" + groceryList.findItem(search) + "' was found.");
    }
}
