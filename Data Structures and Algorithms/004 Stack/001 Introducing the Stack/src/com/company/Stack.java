package com.company;

public class Stack {

    private int maxSize;                // Size of stack.
    private char[] stackArray;          // Container to store list of items.
    private int top;                    // Index position of the last item placed on the stack.

    // Initialize stack with a size. Will use constructor to initialize data structure.
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;                  // The first item placed on stack will be at 0th index.
    }

    public void push(char j) {
        if (isFull()) {
            System.out.println("Cannot add more than " + maxSize + " elements to this stack!");
            return;
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop an empty stack!");
            return '0';
        } else {
            int topCopy = top;
            top--;
            return stackArray[topCopy];  // Return what the old value that we popped was.
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {

        return (top == -1);         // If nothing is in the stack, then top will be -1.
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }


}
