# Stack and Queue Assignment

This project contains the implementation for a basic Stack and Queue in Java, based on the textbook _"Data Structures and Algorithms in Java, Second Edition"_ by Robert Lafore.

## Files Included

- **`MyStack.java`**: Implements a Stack using an array. Follows the **LIFO** (Last-In-First-Out) principle. Replicates a stack of plates—the last one added is the first one removed. Includes a `main` method for testing.

- **`MyQueue.java`**: Implements a circular Queue using an array. Follows the **FIFO** (First-In-First-Out) principle. Replicates a line of people waiting—the first one in line is the first one served. Includes a `main` method for testing.
- **`Main.java`**: A centralized class to test both the Stack and Queue operations together (if you run it).

## How to Run the Code

_(Note: You must have Java installed and added to your system's PATH variable to run these commands in the terminal)_

To compile and run the Main test file:

```cmd
javac Main.java MyStack.java MyQueue.java
java Main
```

To run the classes individually (since they contain their own testing methods):

```cmd
javac MyQueue.java
java MyQueue

javac MyStack.java
java MyStack
```

## Resources

- [Keys to a well-written README](https://medium.com/chingu/keys-to-a-well-written-readme-55c53d34fe6d) - Used as a guideline for structuring good project documentation.
