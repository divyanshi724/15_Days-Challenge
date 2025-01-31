import java.util.Scanner;

public class HeartPattern {
    public static void printHeartPattern(int n) {
        // Upper part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            // Print spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Print stars for the left half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print space between the two halves of the heart
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the right half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower part of the heart
        for (int i = n; i >= 0; i--) {
            // Print spaces before the bottom triangle
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars for the bottom part of the heart
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the heart: ");
        int n = scanner.nextInt();
        
        printHeartPattern(n);
    }
}

