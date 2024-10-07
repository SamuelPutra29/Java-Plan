package Week1.Day1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Declare the scanner
        Scanner input = new Scanner(System.in);

        // Input the numbers from user
        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double Addition = number1 + number2;
        double Subtraction = number2 - number1;
        double Multiplication = number1 * number2;
        double Division = number2 / number1;

        // Display the result
        System.out.println("Addition: " + Addition);
        System.out.println("Subtraction: " + Subtraction);
        System.out.println("Multiplication: " + Multiplication);
        System.out.println("Division: " + Division);
    }
}
