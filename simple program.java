import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }

        System.out.println("Reversed string: " + reversedString.toString().trim());
    }
}