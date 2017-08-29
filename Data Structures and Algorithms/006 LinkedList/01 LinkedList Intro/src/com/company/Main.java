package com.company;

public class Main {

    public static void main(String[] args) {

        Node node1 = new Node();
        node1.data = 4;

        Node node2 = new Node();
        node2.data = 3;

        Node node3 = new Node();
        node3.data = 7;

        Node node4 = new Node();
        node4.data = 8;

        // Now link everything together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(listLength(node1));  // 4
        System.out.println(listLength(node2));  // 3

    }

    public static int listLength(Node node) {
        int count = 0;
        Node currNode = node;
        while(currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;
    }
}
