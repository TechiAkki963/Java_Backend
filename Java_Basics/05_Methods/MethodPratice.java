// Class declaration
class MethodPratice {

    // Static method that accepts two integers
    // and returns the larger of the two.
    static int max(int x, int y) {

        // Check if x is greater than y
        if (x > y) {

            // If true, return x
            return x;

        } else {

            // Otherwise, return y
            return y;
        }
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Declare and initialize two integer variables
        int a = 10, b = 15, c;

        // Call the max() method.
        // The values of a and b are passed as arguments.
        // The returned value is stored in c.
        c = max(a, b);

        // Print the value stored in c
        System.out.println(c);
    }
}