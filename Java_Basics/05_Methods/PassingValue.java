// Class declaration
// This class demonstrates that Java passes primitive variables by value.
class PassingValue {

    // Static method that accepts two integer parameters.
    // x receives a COPY of the first argument.
    // value receives a COPY of the second argument.
    static void change2(int x, int value) {

        // Assign the value of 'value' to 'x'.
        //
        // Initially:
        // x = 10
        // value = 20
        //
        // After this statement:
        // x = 20
        //
        // IMPORTANT:
        // This changes ONLY the local variable 'x'.
        // The original variable 'a' in main() is NOT affected.
        x = value;

        System.out.println(x);
    }

    // Main method - execution starts here.
    public static void main(String[] args) {

        // Declare an integer variable 'a' and initialize it with 10.
        int a = 10;

        // Call change2().
        //
        // Java passes COPIES of the values.
        //
        // Before calling:
        // a = 10
        //
        // Inside change2():
        // x = 10
        // value = 20
        //
        // x becomes 20, but 'a' remains 10.
        change2(a, 20);

        // Print the value of 'a'.
        //
        // Since 'a' was never changed,
        // the output will still be 10.
        System.out.println(a);
        
    }
}