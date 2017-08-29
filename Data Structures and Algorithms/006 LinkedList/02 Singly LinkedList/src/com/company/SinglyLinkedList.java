package com.company;

public class SinglyLinkedList {

    private Node first;

    public SinglyLinkedList(){}

    public boolean isEmpty() {
        return (first == null);
    }

    // Insert at beginning of list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    // Insert last
    public void insertLast(int data) {
        Node currNode = first;
        while(currNode.next != null) {
            currNode = currNode.next;   // Loop until currNode is null
        }
        Node newNode = new Node();
        newNode.data = data;
        currNode.next = newNode;
    }

    // Delete from beginning of list
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;            // Show what was deleted
    }

    // Print content of list
    public void displayList() {
        System.out.println("List (First ---> Last) ");
        Node currNode = first;
        while(currNode != null) {
            currNode.displayNode();
            currNode = currNode.next;
        }
        System.out.println("");
    }
}
