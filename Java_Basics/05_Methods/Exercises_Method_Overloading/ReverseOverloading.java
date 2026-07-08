// Class to demonstrate Method Overloading.
// Method Overloading means creating multiple methods with the
// same name but different parameter lists.
class ReverseOverloading {

    // ------------------- Method 1 -------------------
    // This method reverses the digits of an integer.
    // Example:
    // Input : 1234
    // Output: 4321
    static int reverse(int n) {

        // Variable to store the reversed number.
        int rev = 0;

        // Repeat until all digits of the number are processed.
        while (n > 0) {

            // Extract the last digit.
            // Example:
            // n = 1234
            // r = 4
            int r = n % 10;

            // Add the extracted digit to the reversed number.
            //
            // Example:
            // rev = 0
            // rev = 0 * 10 + 4 = 4
            //
            // Next iteration:
            // rev = 4 * 10 + 3 = 43
            rev = rev * 10 + r;

            // Remove the last digit from n.
            //
            // Example:
            // 1234 becomes 123
            n = n / 10;
        }

        // Return the reversed number.
        return rev;
    }

    // ------------------- Method 2 -------------------
    // This overloaded method reverses an array.
    // Notice the parameter is an int array instead of an int.
    // Therefore Java knows which reverse() method to call.
    static int[] reverse(int A[]) {

        // Create another array of the same size
        // to store the reversed elements.
        int B[] = new int[A.length];

        // i starts from the last index of A.
        // j starts from the first index of B.
        //
        // Example:
        // A = {1,3,5,7}
        //
        // i = 3, j = 0
        // B[0] = A[3] = 7
        //
        // i = 2, j = 1
        // B[1] = A[2] = 5
        //
        // i = 1, j = 2
        // B[2] = A[1] = 3
        //
        // i = 0, j = 3
        // B[3] = A[0] = 1
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {

            // Copy elements from the end of A
            // to the beginning of B.
            B[j] = A[i];
        }

        // Return the entire reversed array.
        return B;
    }

    // Program execution starts here.
    public static void main(String[] args) {

        // Create an integer array.
        int A[] = {1, 3, 5, 7};

        // Call reverse(A).
        //
        // Since an array is passed,
        // Java calls reverse(int A[])
        // and NOT reverse(int n).
        int B[] = reverse(A);

        // Print the reversed array.
        for (int x : B) {
            System.out.print(x + " ");
        }
    }
}