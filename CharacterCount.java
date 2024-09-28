import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterate through the input string
        for (char c : input.toCharArray()) {
            // Update the count of each character in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Print the count of each character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' repeated " + entry.getValue() + " times");
        }

        // Close the scanner
        scanner.close();
    }
}