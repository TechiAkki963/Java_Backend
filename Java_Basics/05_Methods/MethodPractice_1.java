// Class declaration
class MethodPractice_1 {

    // Non-static (instance) method
    // Returns the larger of two integers
    int max(int x, int y) {

        // Compare x and y
        if (x > y) {

            // Return x if it is greater
            return x;

        } else {

            // Otherwise return y
            return y;
        }
    }

    // Main method - program starts here
    public static void main(String[] args) {

        // Declare two integer variables
        int a = 10, b = 15;

        // Create an object of MethodPractice_1
        MethodPractice_1 mp = new MethodPractice_1();

        // Call the max() method using the object
        // and print the returned value
        System.out.println(mp.max(a, b));
    }
}