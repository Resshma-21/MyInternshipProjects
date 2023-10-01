
/**
 * This is a simple calculator application that performs basic arithmetic operations

 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Simple Calculator"); // Input first number
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): "); // Input operator
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: "); // Input second number
        num2 = sc.nextDouble();

        double result = 0;
        // perform the selected operation based on input
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error");
                    // Exit with an error code
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                System.exit(1); // Exit with an error code
        }

        System.out.println("Result: " + result);
    }
}
