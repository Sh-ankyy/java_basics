# Java Basics Practice

A beginner-friendly, menu-driven Java console application that demonstrates 10 fundamental programming exercises.

## Topics covered

1. **Hello World** — class structure and console output
2. **Temperature Converter** — variables, arithmetic, and formatted output
3. **Even or Odd Checker** — modulo and the ternary operator
4. **Multiplication Table** — `for` loops
5. **Digit Counter** — `do-while` loops and integer division
6. **Fibonacci Series** — variables and iterative logic
7. **Prime Number Checker** — Boolean returns and efficient divisor checking
8. **Day Finder** — modern `switch` expressions
9. **Array Operations** — enhanced `for` loops, sum, average, minimum, and maximum
10. **Circle Operations** — reusable methods and `Math.PI`

## Requirements

- Java JDK 17 or newer
- A terminal or Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

## Run the project

Open a terminal in the project folder and run:

```bash
javac -d out src/Main.java
java -cp out Main
```

On Windows, these commands work in Command Prompt or PowerShell when Java is on your PATH.

## How to use it

Run the program and enter the number for the exercise you want to try. Follow the prompts. Enter `0` to exit.

## Example

```text
==================================
       JAVA BASICS PRACTICE
==================================
1. Hello World
2. Fahrenheit to Celsius
3. Even or Odd Checker
4. Multiplication Table
5. Digit Counter
6. Fibonacci Series
7. Prime Number Checker
8. Day Finder
9. Array Operations
10. Circle Operations
0. Exit
Choose an option (0-10): 7
Enter an integer: 17
17 is prime.
```


## Suggested next steps

- Add unit tests for `isPrime`, `calculateArea`, and `calculateCircumference`
- Split each exercise into its own class
- Add more exercises such as factorial, palindrome checker, and finding the maximum of two numbers

## License

This project is available under the MIT License. See [LICENSE](LICENSE).
