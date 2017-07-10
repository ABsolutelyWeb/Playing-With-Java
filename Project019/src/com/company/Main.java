package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList coolBeans = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    coolBeans.printList();
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
                    quit = true;
                    break;
            }
        }
//        coolBeans.addGroceryItem("B1");
//        coolBeans.addGroceryItem("B2");
//        coolBeans.addGroceryItem("B3");
//        coolBeans.addGroceryItem("B4");
//        coolBeans.addGroceryItem("B5");
//
//        coolBeans.modifyGroceryItem(1, "B2.2");
//        coolBeans.deleteGroceryItem(4);
//
//        coolBeans.printList();
//        coolBeans.findGroceryItemUsingIndex(1);
//        coolBeans.findGroceryItemUsingName("B4");
//        coolBeans.findGroceryItemUsingName("B6");
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
        System.out.print("Enter the grocery item: ");
        coolBeans.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        coolBeans.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem() {
        System.out.print("Which index do you want to clear?");
        int removeIndex = scanner.nextInt();
        coolBeans.deleteGroceryItem(removeIndex-1);
    }

    public static void searchForItem() {
        System.out.print("Type the name of the item to search: ");
        String name = scanner.nextLine();
        coolBeans.findGroceryItemUsingName(name);
    }

}
