# Fixed-Growable-Stack-and-Implementation-Practice
This repository implements two stack data structures in Java:

Fixed_stk: A fixed-size stack using an array.
Growable_stk: A dynamic-size stack using an ArrayList.
Both stacks adhere to a common interface (Interface_STK) providing the basic functionalities of pushing, popping, displaying elements, and checking for overflow and underflow.

Key Components:
Interface_STK: Defines the interface for both stack implementations.
Fixed_stk: Fixed-size stack implementation with array, handling overflow gracefully.
Growable_stk: Dynamic-size stack implementation with ArrayList, growing automatically.
InterfaceDemo: Main program demonstrating usage of both stacks and edge cases.
How to Use:
Clone or download the repository.
Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
Run the InterfaceDemo class to interact with the stacks.
Usage Demonstration:
InterfaceDemo prompts for a fixed stack size and showcases:

Pushing elements
Displaying stack contents
Popping elements
Checking overflow/underflow (fixed stack only)
Handling edge cases (full stack, empty stack, display empty)
Function Documentation:
Interface_STK:

push(int element): Adds an element to the top of the stack.
pop(): Removes and returns the top element, or -1 if empty.
displayStack(): Prints stack contents from top to bottom.
isOverflow(): Checks if the stack is full (fixed stack only).
isUnderflow(): Checks if the stack is empty.
Fixed_stk:

Inherits all methods from Interface_STK.
Growable_stk:

Inherits all methods from Interface_STK.
isOverflow() always returns false as the ArrayList grows automatically.
Contributing:
Fork the repository and submit pull requests with improvements or features. Ensure clarity and adhere to the existing coding style.

Additional Notes:
This focuses on basic operations for practice purposes.
Advanced features like error handling and exceptions can be added.
Consider linked lists for Fixed_stk for potential efficiency gains.
