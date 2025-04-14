package solutions.array_questions;

/* a matrix is a 2d array like
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * 90' rotated hali her satirin bir sola kaydirilmişidir
 *
 * 7 4 1
 * 8 5 2
 * 9 6 3
 *
 * int[3][3] arr olarak gösterilir
 *
 * bunu kodda yapmanın yolu
 * önce int[a][b]'yi int[b][a] yap (transpose)
 * sonra her satırı ters çevir (reverse row-wise)
 *
 * */

public class RotateMatrix {


    // O(n^2) -> Time complexity
    // O(1) -> Space complexity (yeni bir ds kullanmadık cünkü)
    public void rotateMatrix(int[][] matrix, int n) {

        // önce int[a][b] -> int [b][a]
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;

            }
        }

        // sonra her satırı reverse
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int tmp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = tmp;
                end--;
                start++;
            }
        }

    }

    public static void main(String[] args) {

        RotateMatrix rm = new RotateMatrix();
        PrintMatrix pm = new PrintMatrix();

        int[][] myMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };


        pm.printMatrix(myMatrix, 3);
        System.out.println();
        rm.rotateMatrix(myMatrix, 3);
        pm.printMatrix(myMatrix, 3);


    }

}
