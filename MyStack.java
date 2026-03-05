/**
 * MyStack - A basic array-based stack implementation in Java.
 * 
 * Concept: LIFO (Last-In-First-Out)
 * 
 * Common Uses:
 * - Parsing programming syntax (Like --> matching parentheses).
 * - Implementing Undo mechanisms in text editors.
 */
public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    /* Constructor to initialize the stack with a maximum capacity.*/

    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    /* Pushes an item onto the top of the stack.
     * (LIFO: This item is now the "last in")
     */
    public void push(long j) {
        stackArray[++top] = j;
    }

    /* Pops (removes and returns) the item from the top of the stack.
     * (LIFO: The "last in" item is the "first out")
     */
    public long pop() {
        return stackArray[top--];
    }

    /* Peeks at the item on the top of the stack without removing it. */
    public long peek() {
        return stackArray[top];
    }

    /**Checks if the stack is completely empty.*/
    public boolean isEmpty() {
        return (top == -1);
    }

    /** Checks if the stack is completely full. */
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== Testing MyStack (LIFO) ===");
        MyStack stack = new MyStack(5);
        
        System.out.println("Pushing items: 10, 20, 30, 40, 50");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Is Stack Full? " + stack.isFull());
        
        System.out.println("Popping items (expecting 50, then 40, etc.):");
        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
