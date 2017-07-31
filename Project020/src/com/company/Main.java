package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("030 003 5555");
    public static void main(String[] args) {

        boolean loop = true;
        startPhone();
        printActions();
        while (loop) {
            System.out.println("\nPress 6 to show all actions: ");
            int action = scanner.nextInt();
            switch(action) {
                case 0:
                    System.out.println("Bye");
                    loop = false;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter contact's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createNewContact(name, phone);

        if (mobilePhone.addContact(newContact)) {
            System.out.println("Contact added: " + name + ", phone: " + phone);
        } else {
            System.out.println("Cannot add " + name + " since it is already on file.");
        }
    }

    private static void updateContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new phone: ");
        String newNum = scanner.nextLine();

        Contact newContact = Contact.createNewContact(newName, newNum);

        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Updated record.");
        } else {
            System.out.println("Error in updating record.");
        }
    }


    private static void removeContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Deleted " + existingContact);
        } else {
            System.out.println("ERROR. Deletion not completed.");
        }
    }


    private static void queryContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("contact not found.");
            return;
        }

        System.out.println("Name: " + existingContact.getName() + "\n Phone: " + existingContact.getPhone());
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Deleted " + existingContact);
        } else {
            System.out.println("ERROR. Deletion not completed.");
        }
    }


    private static void startPhone() {
        System.out.println("Starting phone. Please standby.");
    }

    private static void printActions() {
        System.out.println("\nMenu options:\npress");
        System.out.print("0 - Quit\n");
        System.out.print("1 - Print all contacts\n");
        System.out.print("2 - Add a contact\n");
        System.out.print("3 - Update existing contact\n");
        System.out.print("4 - Delete an existing contact\n");
        System.out.print("5 - Look up a contact\n");
        System.out.print("6 - Print options\n");
        System.out.print("Choose an action to continue: ");
    }
}