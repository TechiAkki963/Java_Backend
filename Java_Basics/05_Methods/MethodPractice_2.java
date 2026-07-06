// Class declaration
// A class is like a blueprint that contains variables and methods.
class MethodPractice_2 {

    // A static method named 'inc'.
    // 'void' means this method does not return any value.
    // It accepts one integer parameter named 'x'.
    static void inc(int x) {

        // Increment the value of x by 1.
        // This only changes the local copy of x,
        // NOT the original variable passed from main().
        x++;

        // Print the updated value of x.
        // Output: 11
        System.out.println(x);
    }

    // The main() method is the starting point of every Java program.
    public static void main(String[] args) {

        // Declare two integer variables.
        // 'a' is initialized to 10.
        // 'b' is initialized to 15.
        // (Note: 'b' is not used in this program.)
        int a = 10, b = 15;

        // Call the inc() method and pass the value of 'a'.
        //
        // IMPORTANT:
        // Java passes a COPY of the value stored in 'a'.
        // So inside inc():
        //      x = 10
        //
        // The variable 'a' and parameter 'x' are DIFFERENT variables.
        //
        // Memory before calling:
        // a = 10
        //
        // Inside inc():
        // x = 10
        //
        // After x++:
        // x = 11
        //
        // 'a' is still 10 because only the copy (x) changed.
        inc(a);

        // Print the value of 'a'.
        // Since 'a' was never modified,
        // it still contains 10.
        System.out.println(a);
    }
}