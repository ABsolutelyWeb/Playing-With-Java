package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNum;
    private ArrayList<Contact> contacts;


    public MobilePhone(String myNum) {
        this.myNum = myNum;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("This contact already exists.");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPos = findContact(oldContact);
        if (foundPos < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.contacts.set(foundPos, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPos = findContact(contact);
        if (foundPos < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contacts.remove(foundPos);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println((i+1) + "." + this.contacts.get(i).getName() + " -> " + this.contacts.get(i).getPhone());
        }
    }
}
