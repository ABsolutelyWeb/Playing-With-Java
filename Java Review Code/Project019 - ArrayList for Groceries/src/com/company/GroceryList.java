package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Add
    public void addGroceryItem(String item) {
        groceryList.add(item);
        System.out.println("Grocery item " + item + " has been added.");
    }


    // Replace
    public void modifyGroceryItem(int pos, String newItem) {
        groceryList.set(pos, newItem);
        System.out.println("Grocery item " + (pos+1) + " has been modified to " + newItem + ".");
    }


    // Remove
    public void deleteGroceryItem(int pos) {
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);
        System.out.println("Grocery item " + theItem + " at position " + (pos+1) + " has been removed.");
    }

    // Find via index
    public void findGroceryItemUsingIndex(int pos) {
        System.out.println("Item at " + pos + " is " + groceryList.get(pos));
    }

    // Find via index
    public String findGroceryItemUsingName(String search) {
        boolean exists = groceryList.contains(search);
        int pos = groceryList.indexOf(search);
        if(exists) {
            System.out.println(search + " was found at index " + pos + ".");
        } else {
            System.out.println(search + " was not found in the list.");
        }
        return search;
    }

    // Print
    public void printList() {
        System.out.println("You have " + groceryList.size() + " items in the list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println( (i+1) + ". " + groceryList.get(i) );
        }
    }
}
