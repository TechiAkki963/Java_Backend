// Class name
class Multiply_2D_Arrays {

    // Main method - execution starts from here
    public static void main(String[] args) {

        // First 3x3 matrix
        int A[][] = {
            {3, 5, 9},
            {7, 6, 2},
            {4, 3, 5}
        };

        // Second 3x3 matrix (Identity Matrix)
        int B[][] = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Create a third matrix to store the multiplication result
        int C[][] = new int[3][3];

        // Outer loop selects the ROW of matrix A
        for (int i = 0; i < 3; i++) {

            // Second loop selects the COLUMN of matrix B
            for (int j = 0; j < 3; j++) {

                // Initialize current element before calculating
                C[i][j] = 0;

                // Third loop performs multiplication and addition
                // It moves across the row of A and the column of B
                for (int k = 0; k < 3; k++) {

                    // Matrix multiplication formula
                    // C[i][j] += A[i][k] * B[k][j]
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        // Enhanced for-loop to print each row of matrix C
        for (int x[] : C) {

            // Print every element in the current row
            for (int y : x) {
                System.out.print(y + " ");
            }

            // Move to the next line after one row
            System.out.println("");
        }
    }
}