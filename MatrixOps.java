public class MatrixOps {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};

        int[][] add = operate(mat1, mat2, '+');
        int[][] sub = operate(mat1, mat2, '-');
        int[][] mul = multiply(mat1, mat2);
        int trace = trace(mat1);

        System.out.println("Addition:"); print(add);
        System.out.println("Subtraction:"); print(sub);
        System.out.println("Multiplication:"); print(mul);
        System.out.println("Trace: " + trace);
    }

    public static int[][] operate(int[][] mat1, int[][] mat2, char op) {
        int[][] res = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++)
            for (int j = 0; j < mat1[0].length; j++)
                res[i][j] = (op == '+') ? mat1[i][j] + mat2[i][j] : mat1[i][j] - mat2[i][j];
        return res;
    }

    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int[][] res = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++)
            for (int j = 0; j < mat2[0].length; j++)
                for (int k = 0; k < mat1[0].length; k++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
        return res;
    }

    public static int trace(int[][] mat) {
        int trace = 0;
        for (int i = 0; i < mat.length; i++)
            trace += mat[i][i];
        return trace;
    }

    public static void print(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}