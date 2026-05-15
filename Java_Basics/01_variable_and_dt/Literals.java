class Literals
{
    public static void main(String args[]){

        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        // Long literal
        long l = 999_999_999_999L;
        System.out.println(l);

        // Double Literal - any number in decimal is considered as Double

        float f = 123_456.56f;
        double d = 12.56d;
        System.out.println(f);
        System.out.println(d);

    }
}

// Decimal - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9                                 byte b = 10;
// Binary - 0 , 1                                                         byte b = 0b1010;
// Octal - 0, 1, 2, 3, 4, 5, 6, 7, 10, 11, 12                             byte b = 012;
// Hexadecimal - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F           byte b = OxA;


