public class Factorial {

    // Recursive function to find factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5; // Change this number to test with different values
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
