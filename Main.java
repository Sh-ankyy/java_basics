import java.util.Scanner;

/**
 * Java Basics Practice
 * A beginner-friendly console application covering 10 core Java exercises.
 * Requires Java 17 or newer.
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose an option (0-10): ");

            switch (choice) {
                case 0 -> {
                    running = false;
                    System.out.println("Thanks for practicing Java. Goodbye!");
                }
                case 1 -> helloWorld();
                case 2 -> temperatureConverter();
                case 3 -> evenOddChecker();
                case 4 -> multiplicationTable();
                case 5 -> digitCounter();
                case 6 -> fibonacciSeries();
                case 7 -> primeNumberChecker();
                case 8 -> dayFinder();
                case 9 -> arrayOperations();
                case 10 -> circleOperations();
                default -> System.out.println("Invalid option. Please choose 0-10.");
            }
            System.out.println();
        }

        SCANNER.close();
    }

    private static void printMenu() {
        System.out.println("==================================");
        System.out.println("       JAVA BASICS PRACTICE");
        System.out.println("==================================");
        System.out.println("1. Hello World");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Even or Odd Checker");
        System.out.println("4. Multiplication Table");
        System.out.println("5. Digit Counter");
        System.out.println("6. Fibonacci Series");
        System.out.println("7. Prime Number Checker");
        System.out.println("8. Day Finder");
        System.out.println("9. Array Operations");
        System.out.println("10. Circle Operations");
        System.out.println("0. Exit");
    }

    // 1. Hello World and environment test
    private static void helloWorld() {
        System.out.println("Hello, World!");
        System.out.println("Java environment is working.");
    }

    // 2. Convert Fahrenheit to Celsius
    private static void temperatureConverter() {
        double fahrenheit = readDouble("Enter temperature in Fahrenheit: ");
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
    }

    // 3. Check whether an integer is even or odd
    private static void evenOddChecker() {
        int number = readInt("Enter an integer: ");
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");
    }

    // 4. Print a multiplication table
    private static void multiplicationTable() {
        int number = readInt("Enter a number: ");
        int limit = readInt("Enter the table limit: ");

        if (limit < 1) {
            System.out.println("The limit must be at least 1.");
            return;
        }

        for (int i = 1; i <= limit; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }

    // 5. Count digits, including safe handling of zero and negative numbers
    private static void digitCounter() {
        long number = readLong("Enter an integer: ");
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
    }

    private static int countDigits(long number) {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }

    // 6. Print a Fibonacci series
    private static void fibonacciSeries() {
        int terms = readInt("How many terms should be printed? ");

        if (terms < 1 || terms > 92) {
            System.out.println("Please enter a number from 1 to 92.");
            return;
        }

        long first = 0;
        long second = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(first);
            if (i < terms - 1) {
                System.out.print(" ");
            }

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // 7. Check whether a number is prime
    private static void primeNumberChecker() {
        int number = readInt("Enter an integer: ");
        System.out.println(number + (isPrime(number) ? " is prime." : " is not prime."));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Convert a number from 1-7 to a weekday
    private static void dayFinder() {
        int day = readInt("Enter a day number (1=Monday, 7=Sunday): ");

        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> null;
        };

        if (name == null) {
            System.out.println("Invalid day number. Enter a value from 1 to 7.");
        } else {
            System.out.println(name);
        }
    }

    // 9. Calculate sum, average, minimum, and maximum for an array
    private static void arrayOperations() {
        int[] numbers = {12, 5, 8, 20, 3, 15};
        int sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
            if (number < minimum) minimum = number;
            if (number > maximum) maximum = number;
        }

        double average = (double) sum / numbers.length;
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }

    // 10. Calculate area and circumference of a circle
    private static void circleOperations() {
        double radius = readDouble("Enter the circle radius: ");

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return;
        }

        System.out.printf("Area: %.2f%n", calculateArea(radius));
        System.out.printf("Circumference: %.2f%n", calculateCircumference(radius));
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static long readLong(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                return Long.parseLong(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (Double.isFinite(value)) {
                    return value;
                }
                System.out.println("Please enter a finite number.");
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
