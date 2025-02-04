import java.util.*;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();
        
        System.out.println("Enter integers (type 'stop' to end):");
        
        while (true) {
            String input = scanner.nextLine();
            try {
                // Try to parse the input as an integer
                int number = Integer.parseInt(input);
                // Add number to set to automatically remove duplicates
                numberSet.add(number);
            } catch (NumberFormatException e) {
                // If input is not an integer, stop the loop
                if (input.equalsIgnoreCase("stop")) {
                    break;
                }
                System.out.println("Invalid input, please enter an integer or 'stop' to finish.");
            }
        }
        
        // Add the unique numbers from the set to the list
        numberList.addAll(numberSet);
        
        // Sort the list
        Collections.sort(numberList);
        
        // Print the sorted list
        System.out.println("Sorted list without duplicates: " + numberList);
    }
}
