# Unit Testing System

This repository contains a Java-based unit testing project developed for laboratory exercises in the **Software
Product Testing Course** at **UTM (Technical University of Moldova)**. The project demonstrates
how to implement a simple utility class (`CustomMath`) and test it using **JUnit 4**, including parameterized
tests, assertions, and exception handling.

## System Overview

The project consists of two main components:

- **CustomMath** → a utility class containing basic mathematical and logical operations
- **CustomMathTest** → JUnit test class used to validate all methods in `CustomMath`

## Application Features

### CustomMath functionality:
- Sum of two numbers
- Division with zero-check validation
- Number sign validation (positive / negative)
- Even and odd number checks
- Comparison operations (greater, smaller, equal)
- Divisibility check
- Sum and product positivity checks

### Testing features:
- Unit tests using **JUnit 4**
- Parameterized tests for multiple input cases
- Exception testing (division by zero)
- Assertions for boolean and numeric validation
- Coverage of all utility methods

## Project Structure

```
src/
├── main/
│   └── java/
│       └── com.laboratory.unittesting/
│           └── CustomMath.java
└── test/
    └── java/
        └── CustomMathTest.java
```

## Installation

1. **Clone the repository**
```bash
   git clone https://github.com/Constantin-Stamate/junit-testing-laboratory
```

2. **Navigate to the project directory**

```bash
   cd junit-testing-laboratory
```

3. **Run the tests**
```bash
   mvn test -Dtest=CustomMathTest
```

## Technologies Used

- **Programming Language:** Java
- **Testing Framework:** JUnit 4
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA

## Author

This project was developed as part of the **Software Product Testing Course** at **UTM (Technical University of Moldova)**.

- GitHub: [Constantin-Stamate](https://github.com/Constantin-Stamate)
- Email: constantinstamate.r@gmail.com