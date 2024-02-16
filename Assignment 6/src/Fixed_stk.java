

public class Fixed_stk implements Interface_STK {
    private int[] stack;
    private int top;

    public Fixed_stk(int size) {
        this.stack = new int[size];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (isOverflow()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    @Override
    public int pop() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    @Override
    public void displayStack() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    @Override
    public boolean isOverflow() {
        return top == stack.length - 1;
    }

    @Override
    public boolean isUnderflow() {
        return top == -1;
    }

}	
