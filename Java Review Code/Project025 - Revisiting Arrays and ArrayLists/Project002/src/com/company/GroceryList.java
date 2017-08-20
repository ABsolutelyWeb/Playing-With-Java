package com.company;

import java.util.ArrayList;

public class GroceryList {

    // Initialize an ArrayList of strings
    private ArrayList<String> groceryList = new ArrayList<String>();

    // To add an item
    public void addGroceryItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Cannot add '" + item + "' since it already exists.");

        } else {
            groceryList.add(item);
            System.out.println("Added " + item + " into the list.");
        }
    }

    // Print items
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // Update an item
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position-1, newItem);
        System.out.println("Grocery item " + (position+1) + " has been updated.");
    }

    // Remove an item
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position-1);
        if (groceryList.contains(theItem)) {
            groceryList.remove(position-1);
            System.out.println(theItem + " at position " + (position) + " was removed.");

        } else {
            System.out.println("Cannot delete '" + theItem + "' because it doesn't exist.");
        }
    }

    // Find an item
    public String findItem(String search) {
        // boolean exists = groceryList.contains(search);
        int position = groceryList.indexOf(search);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
