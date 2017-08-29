package com.company;

public class Queue {

    private int maxSize;        // Initializes set number of slots
    private long[] qArray;      // Slots to maintain data
    private int front;          // Index position for element in front
    private int rear;           // Index position for element in rear
    private int items;          // Counter to maintain number of items in queue

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.qArray = new long[maxSize];
        front = 0;              // Index pos of first array slot
        rear = -1;              // No item in array yet to be considered last item
        items = 0;              // We don't have elements in the array yet

    }

    // When we insert into the queue, the item goes to the end
    public void insert(long j) {

        if(rear == maxSize-1) {
            rear = -1;              // So we can overwrite (circular queue)
        }

        rear++;
        qArray[rear] = j;           // Increment rear and assign j as the value for that index
        items++;

    }


    // Remove item from front
    public long remove() {
        long frontVal = qArray[front];
        front++;                // When we remove front, front should increment to point to the next value in line

        if(front == maxSize) {  // If front is equal to maxSize then we've removed everything from the queue
            front = 0;          // Send front back to zeroth index to utilize index again.
        }

        items--;                // Removing an item means one less item
        return frontVal;
    }


    public long peakFront() {

        return qArray[front];
    }


    public long peakRear() {

        return qArray[rear];
    }


    public boolean isEmpty() {

        return (items == 0);
    }


    // To view content of data structure
    public void view() {

        for(int i = 0; i < qArray.length; i++) {
            System.out.print(qArray[i] + " ");
        }
    }





}
