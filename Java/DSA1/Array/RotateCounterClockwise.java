package Array;

public class RotateCounterClockwise {
    static void rotateCounterClockwise(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = A[i][j];
                int b = A[n - j - 1][n - i - 1];
                A[i][j] = b;
                A[n - j - 1][n - i - 1] = a;
            }
        }

        display(A);
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
    }

    static void display(int[][] A) {
        for (int[] row : A) {
            for (int e : row)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("Before rotation: ");
        display(A);
        System.out.println("After rotation: ");
        rotateCounterClockwise(A);
        display(A);
    }

}
