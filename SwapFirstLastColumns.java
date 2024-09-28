import java.util.Scanner;

public class SwapFirstLastColumns {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Define the matrix
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        // Input the matrix elements from the user
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Swap the first and last columns of the matrix
        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][cols - 1];
            matrix[i][cols - 1] = temp;
        }

        // Output the modified matrix
        System.out.println("Matrix after swapping the first and last columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}