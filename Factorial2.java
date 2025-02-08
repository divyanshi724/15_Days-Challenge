import java.util.Scanner;

public class Factorial2 {

    // Recursive method to calculate factorial
    public static int factorialRecursive(int n) {
        // Base case: if n is 0, return 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorialRecursive(n - 1);
        }
    }

    // Iterative method to calculate factorial
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to check if the number is valid (non-negative)
    public static boolean isValidInput(int n) {
        return n >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a non-negative integer to calculate the factorial: ");
        int number = scanner.nextInt();

        // Validate the input
        if (!isValidInput(number)) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using both methods
            System.out.println("Factorial of " + number + " (recursive) is: " + factorialRecursive(number));
            System.out.println("Factorial of " + number + " (iterative) is: " + factorialIterative(number));
        }

        scanner.close();
    }
}

