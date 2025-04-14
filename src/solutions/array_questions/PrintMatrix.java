package solutions.array_questions;

public class PrintMatrix {

    public void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        PrintMatrix pm = new PrintMatrix();

        int[][] myMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        pm.printMatrix(myMatrix, 3);

    }

}
