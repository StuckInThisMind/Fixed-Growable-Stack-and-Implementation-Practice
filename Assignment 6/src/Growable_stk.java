import java.util.*;

interface Interface_STK {
    void push(int element);
    int pop();
    void displayStack();
    boolean isOverflow();
    boolean isUnderflow();
}

public class Growable_stk implements Interface_STK {
    ArrayList<Integer> stack;
    int top = -1;
    int initialCapacity = 5;

    public Growable_stk() {
        stack = new ArrayList<Integer>(initialCapacity);
    }

    @Override
    public void push(int element) {
        stack.add(++top, element);
    }

    @Override
    public int pop() {
        if (isUnderflow()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int element = stack.get(top);
            stack.remove(top--);
            return element;
        }
    }

    @Override
    public void displayStack() {
        for (int x : stack) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    @Override
    public boolean isOverflow() {
        System.out.println("Since ArrayList automatically grows, overflow condition is never reached");
        return false;
    }

    @Override
    public boolean isUnderflow() {
        return (top == -1);
    }
}
