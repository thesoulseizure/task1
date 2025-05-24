# Task 1

## Overview

This repository, **Task 1**, contains a collection of Java programs demonstrating the use of branching and looping statements. These programs solve various problems such as printing number sequences, reversing numbers, checking number signs, finding the smallest among three numbers, calculating discounts, and printing number patterns.

## Prerequisites

To run the programs in this repository, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)
- Git (optional, for cloning the repository)

## Setup Instructions

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/thesoulseizure/task1.git
   ```

2. **Navigate to the Repository**:

   ```bash
   cd task1
   ```

3. **Compile and Run**:

   - Compile each Java file using:

     ```bash
     javac Filename.java
     ```

   - Run the compiled program:

     ```bash
     java Filename
     ```

### Run Example

To run the `QuestionOne.java` program:

```bash
javac QuestionOne.java
java QuestionOne
```

This will print numbers from 10 to 50.

## Project Structure

The repository is organized as follows:

```
task1/
├── QuestionOne.java
├── QuestionTwo.java
├── QuestionThree.java
├── QuestionFour.java
├── QuestionFive.java
├── QuestionSix.java
├── QuestionSixA.java
├── README.md
└── LICENSE
```

All Java programs are located in the root directory.

## Programs Included

This repository contains the following Java programs:

1. **QuestionOne.java**: Prints numbers from 10 to 50 using a for loop.
   - **Example Output**:
     ```
     10
     11
     ...
     50
     ```

2. **QuestionTwo.java**: Determines if a given number is positive or negative.
   - **Example Input**: `123`
   - **Example Output**: `Positive`
   - **Example Input**: `-100`
   - **Example Output**: `Negative`

3. **QuestionThree.java**: Reverses a given number using loops (e.g., 876 to 678).
   - **Example Input**: `876`
   - **Example Output**: `Reversed number: 678`

4. **QuestionFour.java**: Finds the smallest among three numbers.
   - **Example Input**: `10 5 8`
   - **Example Output**: `Smallest number: 5`

5. **QuestionFive.java**: Calculates the final payable amount after applying discounts based on the purchase amount.
   - **Example Input**: `1200`
   - **Example Output**: `Final payable amount: 960.00`
   - **Discount Rules**:
     - < 500: No discount
     - 500–1000: 10% discount
     - > 1000: 20% discount

6. **QuestionSix.java** and **QuestionSixA.java**: Print a specific number pattern using nested loops. `QuestionSixA.java` may be an alternative implementation.
   - **Example Output**:
     ```
     5 5 5 5 5
     5 4 4 4 4
     5 4 3 3 3
     5 4 3 2 2
     5 4 3 2 1
     ```

## Usage

Each program is self-contained and can be run independently. Input values are hardcoded or prompted via the console, as specified in the problem statements. Refer to individual files for specific details on inputs and outputs.

## Contributing

Contributions are welcome! If you have suggestions or improvements:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit (`git commit -m 'Add feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For any questions or feedback, please open an issue in this repository or contact dineshchandra962@gmail.com.
