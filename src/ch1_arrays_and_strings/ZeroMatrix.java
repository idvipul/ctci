package ch1_arrays_and_strings;

public class ZeroMatrix {
    private static void setZero(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // boolean array to keep track of 0 in every row and col
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        // traverse through the matrix and where 0 is found, make that row and column as true in the boolean array
        // Matrix is still untouched
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    rowZero[r] = true;
                    colZero[c] = true;
                }
            }
        }

        // nullify rows --> order matters (row first)
        for(int r = 0; r < rows; r++) {
            if (rowZero[r]) {
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        // nullify cols
        for(int c = 0; c < cols; c++) {
            if (colZero[c]) {
                for (int r = 0; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        System.out.println("Modified Array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 0}, {0, 7, 6, 5}, {3, 3, 2, 1}};

        System.out.println("Original Array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        setZero(array);
    }
}