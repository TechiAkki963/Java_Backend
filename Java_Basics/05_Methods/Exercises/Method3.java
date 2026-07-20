class Method3 {

    // Method to find the largest element in an array
    static int maxElement(int A[]) {

        // Assume the first element is the largest
        int m = A[0];

        // Start from the second element
        for (int i = 1; i < A.length; i++) {

            // If current element is larger than m,
            // update m
            if (A[i] > m) {
                m = A[i];
            }
        }

        // Return the largest element
        return m;
    }

    public static void main(String[] args) {

        int A[] = {3, 5, 9, 7};

        System.out.println("Maximum Element = " + maxElement(A));
    }
}