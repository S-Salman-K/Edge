package Array;


public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean isRowZero = false;
        boolean isColZero = false;

        for (int i = 0; i < r; i++) {
            isColZero = isColZero || (matrix[i][0] == 0);
            for (int j = 0; j < c; j++) {
                if (i == 0)
                    isRowZero = isRowZero || (matrix[0][j] == 0);
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < c; j++)
                    matrix[i][j] = 0;
            }
        }

        for (int j = 1; j < c; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < r; i++)
                    matrix[i][j] = 0;
            }
        }

        if (isRowZero) {
            for (int j = 1; j < c; j++)
                matrix[0][j] = 0;
        }

        if (isColZero) {
            for (int i = 1; i < r; i++)
                matrix[i][0] = 0;
        }

    }

    static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int e : row)
                System.out.print(e + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        display(matrix);
        setZeroes(matrix);
        display(matrix);
    }
}
