import java.util.Scanner;

public class InterfaceDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed Stack Demonstration
        int fixedStackSize;
        do {
            System.out.print("Enter size of fixed stack (positive integer): ");
            fixedStackSize = sc.nextInt();
        } while (fixedStackSize <= 0);

        System.out.println("\n** Fixed Stack Demonstration **");
        Fixed_stk fixedStack = new Fixed_stk(fixedStackSize);
        demonstrateStack(fixedStack, "** Fixed Stack **");

        // Growable Stack Demonstration
        Growable_stk growableStack = new Growable_stk();
        demonstrateStack(growableStack, "** Growable Stack **");

        sc.close();
    }

    private static void demonstrateStack(Interface_STK stack, String title) {
        System.out.println("\n" + title);

        // Pushing elements
        System.out.println("Pushing elements 1, 2, 3, 4, 5...");
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        System.out.println("Displaying stack:");
        stack.displayStack();

        // Popping an element
        System.out.println("\nPopping an element:");
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("\nDisplaying stack after popping:");
        stack.displayStack();

        // Edge cases
        System.out.println("\n** Edge Cases **");

        // Overflow (Fixed Stack only)
        if (stack instanceof Fixed_stk) {
            System.out.println("\nAttempting to push more elements to force overflow:");
            for (int i = 6; i <= 10; i++) {
                stack.push(i);
            }
        }

        // Underflow
        System.out.println("\nPopping all elements to force underflow:");
        while (!stack.isUnderflow()) {
            stack.pop();
        }

        System.out.println("\nAttempting to pop from an empty stack:");
        stack.pop();

        System.out.println("\nAttempting to display an empty stack:");
        stack.displayStack();
    }
}
