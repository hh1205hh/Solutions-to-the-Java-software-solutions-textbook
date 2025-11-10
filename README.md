# Java Textbook Programming Solutions

This repository contains a large collection of Java programming exercises and projects, believed to be solutions for the textbook *"Java Software Solutions"* (likely by Lewis & Loftus). The solutions are organized into packages by topic and cover a wide range of fundamental computer science concepts.

The original problem descriptions can be found in the `Java Solusions/exercises.pdf` file.

## Topics & Concepts Covered

This collection serves as a practical demonstration of core Java programming and computer science topics, including:

* **Object-Oriented Programming (OOP):** Implementing classes and objects for real-world concepts like `Car`, `Dog`, `Book`, `Flight`, and `Sphere`.
* **Inheritance & Polymorphism:** Demonstrated in packages like `HospitalEmployees` (e.g., `Doctor`, `Nurse` extending `Employees`) and `TypesReadingMaterial`.
* **Interfaces:** Use of interfaces for defining contracts, such as `Priority` and `Complexity`.
* **Data Structures:** Basic implementations of data structures like `TwoStack.java`.
* **Recursion:** A strong focus on recursive problem-solving, including:
    * Towers of Hanoi (`SolveTowers.java`)
    * Palindrome Checkers
    * Maze Solver (Backtracking)
    * N-Queens Problem (`NAQProblem.java`)
* **Algorithms:**
    * Euclid's Algorithm
    * Pascal's Triangle generation
* **File I/O:** Reading data from text files (e.g., `data.text`) to be processed by programs.
* **Basic Java GUI (Swing):** Simple graphical applications, such as `PushButton`, `CrayonBox`, and a diner seating chart.
* **Arrays and Nested Loops:** Various exercises for array manipulation and generating patterns with nested loops (e.g., `Asterisks`, `NestedLoops`).

## How to Use

Each directory (e.g., `Car`, `MazeSolver`) generally acts as a self-contained package. To run a solution, you can compile the `.java` files within that directory and run the main class (which often ends in `Test`, `Main`, or `Exercise`, e.g., `CarTest.java`, `MazeExercise.java`).

**Example (Compiling and Running the `Car` project):**

```bash
cd Car
javac *.java
java CarTest
