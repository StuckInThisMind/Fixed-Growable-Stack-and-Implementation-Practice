# Fixed-Growable-Stack-and-Implementation-Practice
## Java Stack Implementations

This repository implements two Java data structures representing stacks:

- **Fixed_stk**: A fixed-size stack using an array, gracefully handling overflow conditions.
- **Growable_stk**: A dynamic-size stack utilizing an ArrayList for automatic growth as needed.

Both stacks adhere to the common interface, `Interface_STK`, which provides:

- `push(int element)`: Adds an element to the top of the stack.
- `pop()`: Removes and returns the top element, returning -1 if the stack is empty.
- `displayStack()`: Prints the stack's contents from top to bottom.
- `isOverflow()`: Checks if the stack is full (applicable only to Fixed_stk).
- `isUnderflow()`: Checks if the stack is empty.

## Key Components

- **Interface_STK**: Defines the common interface for both stack implementations.
- **Fixed_stk**: Fixed-size stack implementation using an array, ensuring proper overflow handling.
- **Growable_stk**: Dynamic-size stack implementation using an ArrayList, expanding automatically on demand.
- **InterfaceDemo**: Main program demonstrating the usage of both stacks and handling edge cases.

## Getting Started

1. **Clone or download**: Replicate the repository's content.
2. **Open in IDE**: Use your preferred IDE (e.g., Eclipse, IntelliJ IDEA) to work with the project.
3. **Run InterfaceDemo**: Execute the InterfaceDemo class to interact with the stacks.

## Usage Demonstration

InterfaceDemo prompts for the fixed stack size and showcases:

- Pushing elements: Add elements to the stack.
- Displaying stack contents: View the current elements in the stack.
- Popping elements: Remove and retrieve elements from the top of the stack.
- Checking overflow/underflow: Verify if the stack is full or empty (for Fixed_stk only).
- Handling edge cases: Address scenarios like full stacks, empty stacks, and displaying empty stacks.

## Function Documentation

**Interface_STK:**

- `push(int element)`: Adds an element to the top of the stack. Returns true upon successful addition, and false if the stack is full (only applicable to Fixed_stk).
- `pop()`: Removes and returns the top element, or -1 if the stack is empty.
- `displayStack()`: Prints the stack's contents from top to bottom.
- `isOverflow()`: Checks if the stack is full (applicable only to Fixed_stk). Returns true if full, and false otherwise.
- `isUnderflow()`: Checks if the stack is empty. Returns true if empty, and false otherwise.

**Fixed_stk:**

- Inherits all methods from Interface_STK.

**Growable_stk:**

- Inherits all methods from Interface_STK.
- `isOverflow()`: Always returns false as the ArrayList automatically grows to accommodate new elements.

## Contributing

1. **Fork the repository**: Create a copy of the repository on your GitHub account.
2. **Make improvements**: Add features, fix bugs, or enhance the code.
3. **Submit pull requests**: Share your changes with the project maintainers, ensuring clarity and adherence to the coding style.


## Mulitple Interface

# Code Explanation

## ExamInterface

The `ExamInterface` is an interface that outlines the methods required to display exam details and calculate the percentage for a student.

### Methods

- `void displayExamDetails()`: This method is responsible for displaying the exam details, such as the PRN (Permanent Registration Number), name, and marks for each subject.
- `double Percent_cal(double mark1, double mark2, double mark3)`: This method calculates the percentage based on the marks obtained in three subjects.

## Result

The `Result` class implements the `ExamInterface` interface and represents the result of a student.

### Constructor

- `public Result(String name, int prn, double mark1, double mark2, double mark3)`: This constructor initializes the `Result` object with the provided name, PRN, and marks for three subjects.

### Methods

- `double Percent_cal(double mark1, double mark2, double mark3)`: This method overrides the `Percent_cal` method defined in the `ExamInterface` interface to calculate the percentage.
- `void displayExamDetails()`: This method overrides the `displayExamDetails` method defined in the `ExamInterface` interface to display the exam details including PRN, name, marks for each subject, and the calculated percentage.

## Student

The `Student` class represents a student with attributes such as name, PRN, and marks for three subjects.

### Constructor

- `public Student(String name, int prn, double mark1, double mark2, double mark3)`: This constructor initializes a `Student` object with the provided name, PRN, and marks for three subjects.

### Attributes

- `String name`: Represents the name of the student.
- `int prn`: Represents the PRN (Permanent Registration Number) of the student.
- `double mark1, mark2, mark3`: Represent the marks obtained by the student in three subjects.

## Main

The `Main` class contains the main method and serves as the entry point for the program.

### Main Method

- `public static void main(String[] args)`: This method prompts the user to input details such as student name, PRN, and marks for three subjects. It then creates a `Result` object with the provided details and displays the exam details using the `displayExamDetails` method.



## Additional Notes

- This implementation focuses on basic stack operations for practice purposes.
- Advanced features like error handling and exceptions can be added for robustness.
- Consider using linked lists for Fixed_stk to potentially improve efficiency in certain scenarios.
