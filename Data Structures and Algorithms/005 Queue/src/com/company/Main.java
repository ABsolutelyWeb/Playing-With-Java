package com.company;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(5);
        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);
        myQueue.insert(6);
        myQueue.view();
    }
}
