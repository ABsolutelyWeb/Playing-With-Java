package com.company;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(123);
        myList.insertFirst(345);
        myList.insertFirst(85);
        myList.insertFirst(12);
        myList.insertLast(22);

        myList.displayList();


    }
}
