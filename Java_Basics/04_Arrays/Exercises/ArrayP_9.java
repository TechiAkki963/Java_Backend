class ArrayP_9{

    public static void main(String[] args) {
        
        
        // Create an array A with 5 elements
        int A[] = {8, 6, 10, 9, 2};

        // Print the length of array A
        System.out.println("Length of A = " + A.length);

        // Create a new array B with size 10
        // All values are initially 0
        int B[] = new int[10];

        // Copy every element from A into B
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            }

        // Make A point to the new bigger array
            A = B;
            

        // Print the new length of A
            System.out.println("Length of A = " + A.length);

           

    }
}