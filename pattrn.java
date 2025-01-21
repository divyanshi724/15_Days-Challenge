public class pattrn {
    public static void main(String[] args) {
        int n = 4; // Height of the pyramid

        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
