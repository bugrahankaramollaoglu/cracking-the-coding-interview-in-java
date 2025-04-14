package solutions.array_questions;

import java.util.ArrayList;
import java.util.Arrays;

/* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0. */


public class ZeroMatrix {


    // my solution but works O(m*n*k) (k size of matrice)
    public void zeroMatrix(int[][] matrix, int m, int n) {

        ArrayList<Integer> columnsToZero = new ArrayList<>();
        ArrayList<Integer> rowsToZero = new ArrayList<>();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowsToZero.add(i);
                    columnsToZero.add(j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (rowsToZero.contains(i)) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (columnsToZero.contains(i)) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // a better solution using binary arrays ins. of ArrayList as I did.
    // O(m*n) time complexity and O(m+n) space complexity (for we use 2 arrays of m and n)
    public void zeroMatrix2(int[][] matrix, int m, int n) {
        boolean[] rowsToZero = new boolean[m];
        boolean[] columnsToZero = new boolean[n];

        // mark rows and columns that need to be 0ed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowsToZero[i] = true;
                    columnsToZero[j] = true;
                }
            }
        }

        // now 0 time
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowsToZero[i] || columnsToZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("rows: " + Arrays.toString(rowsToZero));
        System.out.println("columns: " + Arrays.toString(columnsToZero));
    }

    public static void main(String[] args) {

        ZeroMatrix zMatrix = new ZeroMatrix();

        int[][] myMatrix = {
                {1, 2, 3},
                {4, 0, 5},
                {2, 7, 8},
                {0, 3, 9},
        };

//        zMatrix.zeroMatrix(myMatrix, 4, 3);
//        zMatrix.zeroMatrix2(myMatrix, 4, 3);

    }

}
