/*
 * MyQueue - A basic circular array-based queue implementation in Java.
 
 * Concept: FIFO (First-In-First-Out)
 
 * Common Uses:
 * - Operating system task scheduling (like --> printer queues, CPU task queues).
 * - Buffers for handling asynchronous data transfer.
 */

public class MyQueue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    /*Constructor to initialize the queue with a maximum capacity.*/
    public MyQueue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /*
     * Inserts an item at the rear of the queue.
     * (FIFO: This item goes to the "back of the line")
     */
    public void insert(long j) {
        if (rear == maxSize - 1) { // deal with wraparound
            rear = -1;
        }
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }

    /*
     * Removes and returns the item at the front of the queue.
     * (FIFO: The "first in" line is the "first out")
     */
    public long remove() {
        long temp = queArray[front++]; // get value and incr front
        if (front == maxSize) { // deal with wraparound
            front = 0;
        }
        nItems--; // one less item
        return temp;
    }

    /* Peeks at the item at the front of the queue without removing it. */

    public long peekFront() {
        return queArray[front];
    }

    /* Checks if the queue is completely empty. */
    
    public boolean isEmpty() {
        return (nItems == 0);
    }

    /*Checks if the queue is completely full. */
    public boolean isFull() {
        return (nItems == maxSize);
    }

    /* Returns the number of items currently in the queue. */

    public int size() {
        return nItems;
    }

    /* THE MAIN METHOD */

    public static void main(String[] args) {
        System.out.println("=== Testing MyQueue (FIFO) ===");
        MyQueue queue = new MyQueue(5);
        
        System.out.println("Inserting items: 10, 20, 30, 40, 50");
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        
        System.out.println("Is Queue Full? " + queue.isFull());
        
        System.out.println("Removing items (expecting 10, then 20, etc.):");
        while (!queue.isEmpty()) {
            long value = queue.remove();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
