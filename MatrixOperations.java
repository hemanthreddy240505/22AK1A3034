public class MatrixOperations {

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method for matrix addition
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new RuntimeException("Matrices are not the same size");
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method for matrix subtraction
    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new RuntimeException("Matrices are not the same size");
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method for matrix multiplication
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new RuntimeException("Matrices are not compatible for multiplication");
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to calculate trace of a matrix
    public static int calculateTrace(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new RuntimeException("Matrix is not square");
        }
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    public static void main(String[] args) {
        // Define matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        // Print matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        // Perform operations
        int[][] additionResult = addMatrix(matrix1, matrix2);
        int[][] subtractionResult = subtractMatrix(matrix1, matrix2);
        int[][] multiplicationResult = multiplyMatrix(matrix1, matrix2);
        int traceResult = calculateTrace(matrix1);

        // Print results
        System.out.println("Addition Result:");
        printMatrix(additionResult);
        System.out.println("Subtraction Result:");
        printMatrix(subtractionResult);
        System.out.println("Multiplication Result:");
        printMatrix(multiplicationResult);
        System.out.println("Trace of Matrix 1: " + traceResult);
    }
}